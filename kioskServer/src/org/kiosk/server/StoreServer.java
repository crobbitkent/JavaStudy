package org.kiosk.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;

import org.kiosk.server.task.Task;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StoreServer {
	
	private Map<String, Task> taskMap;

	
	public void runServer() {
		
		try(ServerSocket server = new ServerSocket(5555);) {
			
			System.out.println("ready..............server.............");
			
			while(true) {
				
				try(Socket socket = server.accept();
						DataInputStream din = new DataInputStream(socket.getInputStream());
						DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						){
					
					String clientJsonStr = din.readUTF();
					System.out.println("client: " + clientJsonStr);
					
					
					JsonElement jsonEle = JsonParser.parseString(clientJsonStr);
					JsonObject jsonObject = jsonEle.getAsJsonObject();
					String oper = jsonObject.get("oper").getAsString();
					
					System.out.println(oper);
					
					taskMap.get(oper).runTask(jsonEle, dos);
					
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				
			}//end while
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
