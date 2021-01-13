package d16;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SimpleWebServer {

	
	public static void main(String[] args) {
		
		
		// AutoCloseable
		try (ServerSocket server = new ServerSocket(8080)) {

			System.out.println(server);
			int socketCount = 0;

			while (true) {
				try (Socket socket = server.accept();
						InputStream sin = socket.getInputStream();
						OutputStream sout = socket.getOutputStream();
						Scanner socketScanner = new Scanner(sin);) {

					// 새로운 클래스(sin, sout); 이렇게 만들면 좋다.

					// 이부분만 추상화로 빼면 좋을 것 같다.
					{
						System.out.println("A client connected....... : " + socket);

						// 읽는다.
						String command = socketScanner.nextLine();
						System.out.println(command);

						// 보낸다. (쓴다)
						String[] arr = command.split(" ");
						
						File file = new File("C:\\testDB" + arr[1]);
						
						long length = file.length();
						
						// 비어있는 파일이라면 skip
						if(0 == length) { 
							System.out.println(file + " 파일을 찾을 수 없습니다.");
							continue;
						}
						
						Path path = file.toPath();
						String mimeType = Files.probeContentType(path);
						
						//========================= HEADER =========================//
						sout.write(new String("HTTP/1.1 200 OK\r\n").getBytes()); 
						sout.write(new String("Cache-Control: private\r\n").getBytes());
						                     // 보내는 데이터의 길이 (Body message의 길이)
						sout.write(new String("Content-Length: "+ length + "\r\n").getBytes());
						                     // 보내는 컨텐츠의 종류 : 해석을 못하면 browser가 다운로드 한다. 
											 // 동영상을 보내고 싶으면 type을 바꾼다.
						sout.write(new String("Content-Type: " + mimeType + "\r\n\r\n").getBytes());
						
						//========================= BODY =========================//
						FileInputStream fin = new FileInputStream(file);
						byte[] buffer = new byte[1024 * 8];
						
						while(true) {
							int count = fin.read(buffer);
							if(-1 == count) {
								break;
							}
							
							sout.write(buffer, 0, count);
						}
						
						
						
						
						
					}
					
					// stream에 남아 있는 데이터를 밀어준다. 쓰는게 좋다
					sout.flush();

					System.out.println();
					System.out.println("============================================ count : " + ++socketCount);
					System.out.println();

				} catch (Exception e) {
					System.out.println("socket accept 불가");
				}
			} // while end

		} catch (Exception e) {
			// 문제가 있을 때 무슨 문제?
			// 그러나 이건 안 좋다. 시스템이 죽기 때문?
			e.printStackTrace();
			// System.out.println();
		} finally {

		}
		
		
	}
	
	
	
}
