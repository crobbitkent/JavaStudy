package onetoone;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OneServer {
	
	public static void main(String[] args) {
		 
		// 서버는 서버 소켓을 먼저
		// 클라는 소켓 하나 생성
		System.out.println("Server ready...");
		
		try(ServerSocket server = new ServerSocket(5555);
			Scanner keyScanner = new Scanner(System.in);
			Socket socket = server.accept();
			DataInputStream din = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());){
			
			System.out.println("Server ready...");
			System.out.println("A client connected : " + socket);
			
			// THREAD
			// 문제는 unreachable code, 그래서 잠시 for로 쓰자

			
			new Thread(()-> {
				try {
					// 읽기용
					for( int i = 0; i < 100; ++i) {
						String message = din.readUTF();
						System.out.println("받은 메시지 : " + message);
					}
					
				} catch(Exception e) {
					e.printStackTrace();
				}
			}).start();
			
			
		
			// 쓰기용
			for( int i = 0; i < 100; ++i) {
				String message = keyScanner.nextLine();
				dos.writeUTF(message);
				dos.flush();
			}
			
			
			
		}catch(Exception e) {
			
		}
		
		
	}
	
}
