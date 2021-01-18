package onetoone;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OneServer2 {

	//bad code
	public static void main(String[] args) throws Exception{
		
		Scanner keyScanner = new Scanner(System.in);
		
		new Thread(()-> {
			try {
				
				ServerSocket server = new ServerSocket(5555);
				
				while(true) {
					Socket other = server.accept();
					DataInputStream din = new DataInputStream(other.getInputStream());
					
					System.out.println("받은메시지:"+din.readUTF());
					
					din.close();
					other.close();
					
				}//end while
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}).start();
		
		
		
		new Thread(()-> {
			try {
				while(true) {
				System.out.println("상대방의 아이피");
				String ip = keyScanner.nextLine();
				
				System.out.println("보낼 메시지");
				String msg = keyScanner.nextLine();
				
				Socket socket = new Socket(ip,5555);
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				
				dos.writeUTF(msg);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}).start();
		
	}
	
}