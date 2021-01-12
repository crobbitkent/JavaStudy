package d15;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClIentTest {
	
	
	public static void main(String[] args) throws Exception {
	
		Socket socket = new Socket("192.168.0.108", 5555);
		// Socket socket = new Socket("192.168.0.247", 5555);
		// Socket socket = new Socket("192.168.0.101", 5555);
		
		System.out.println(socket);

		
		String message = "Hello, world from Mingyu\n";
		
		OutputStream out = socket.getOutputStream();

		byte[] arr = message.getBytes();
		out.write(arr);
		
		//============== 메시지 받기 ========================//
		
		InputStream in = socket.getInputStream();
		Scanner scanner = new Scanner(in);
		
		message = scanner.nextLine();
		System.out.println("서버에서 받은 메시지");
		System.out.println(message);
		
		socket.close();
		in.close();
		out.close();
		scanner.close();
	}
}
