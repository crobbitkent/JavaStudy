package manytomany;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ManyServer {

	
	public static void main(String[] args) {
		
		// 1. 서버 소켓
		try(ServerSocket server = new ServerSocket(5555);){
			
			Set<DataOutputStream> dosList = new HashSet<>();
			
			while(true) {
				
				try(
				Socket client = server.accept();
				DataInputStream din = new DataInputStream(client.getInputStream());
				DataOutputStream dos = new DataOutputStream(client.getOutputStream());
				){
					dosList.add(dos);
					
					new Thread(()->{
						while(true) {
							try {
								String message = din.readUTF();
						
								for(DataOutputStream target: dosList) {
									target.writeUTF(message);
								}
							} catch(Exception e) {
								e.printStackTrace();
								
							}
							
						}
					}).start();
					
				} catch(Exception e) {
					e.printStackTrace();
				}
				
			} // end while
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
