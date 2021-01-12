package d15;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TestWebServer {
	public static void main(String[] args) throws Exception {
			
			ServerSocket server = new ServerSocket(5555);
			
			System.out.println(server);
			
			for(int i = 0; i < 10; ++i) {
				Socket socket = server.accept();
				System.out.println(socket);
				
				InputStream in = socket.getInputStream();
				Scanner scanner = new Scanner(in);
				
				// 읽는다.
				String str = scanner.nextLine();
				
				System.out.println("BROWSER : " + str);
				
				// 보낸다. (쓴다)
				OutputStream out = socket.getOutputStream();
				
				String message = "<h1>Hello, world from Mingyu!</h1>";
			
				//======================================== HEAD ====================================//
				// This is magic. = 응답 헤더 메시지 => 프로토콜이 검사 => Browser에서 출력
				                              // 상태 코드 : 200 괜찮다는 뜻
				out.write(new String("HTTP/1.1 200 OK\r\n").getBytes()); 
				out.write(new String("Cache-Control: private\r\n").getBytes());
				                     // 보내는 데이터의 길이 (Body message의 길이)
				out.write(new String("Content-Length: "+ message.getBytes().length+"\r\n").getBytes());
				                     // 보내는 컨텐츠의 종류 : 해석을 못하면 browser가 다운로드 한다. 
									 // 동영상을 보내고 싶으면 type을 바꾼다.
				out.write(new String("Content-Type: text/html; charset=UTF-8\r\n\r\n").getBytes());
				
				//======================================== BODY ====================================//
				out.write(message.getBytes());
				
				System.out.println();
				System.out.println("============================================ " + i);
				System.out.println();
				
				scanner.close();
				in.close();
				out.close();
				socket.close();
			}
	}
}
