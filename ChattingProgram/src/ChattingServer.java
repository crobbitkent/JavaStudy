import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ChattingServer {

	public static void main(String[] args) {

		try (ServerSocket server = new ServerSocket(8080)) {

			System.out.println(server);
			int count = 0;			
			
			System.out.println("Waiting...");
			
			while (true) {
				try (Socket socket = server.accept();
					 InputStream sin = socket.getInputStream();
					 OutputStream sout = socket.getOutputStream();
					 Scanner socketScanner = new Scanner(sin);) {

					// 새로운 클래스(sin, sout); 이렇게 만들면 좋다.
					// 이부분만 추상화로 빼면 좋을 것 같다.
					{
						System.out.println("A client connected : " + socket);

						// 읽는다.
						String command = socketScanner.nextLine();
						System.out.println(command);

						sout.write((command + "\n").getBytes());
					}

					// stream에 남아 있는 데이터를 밀어준다. 쓰는게 좋다
					sout.flush();

					System.out.println();
					System.out.println("============================================" + count);
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
