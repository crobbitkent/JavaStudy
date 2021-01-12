package d15;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest {
	
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(5555);
		
		System.out.println(server);
		
		for(int i = 0; i < 10; ++i) {
			Socket socket = server.accept();
			System.out.println(socket);
			
			InputStream in = socket.getInputStream();
			Scanner scanner = new Scanner(in);
			
			// 읽는다.
			String str = scanner.nextLine() + "\n";
			byte[] arr = str.getBytes();
			
			// 보낸다. (쓴다)
			OutputStream out = socket.getOutputStream();
			out.write(arr);

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
