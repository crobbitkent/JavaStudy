package kiosk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.keroro.store.Menu;
import org.keroro.store.Order;
import org.keroro.store.OrderItem;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class DataClient {

	public static void main(String[] args) {
		System.out.println("클라이언트 시작");
		try(Socket socket = new Socket("127.0.0.1", 5555);
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			DataInputStream din = new DataInputStream(socket.getInputStream());
		){
			
			Map<String, Object> msgMap = new HashMap<>();
			msgMap.put("oper", "O");			
			
			
			//--------------------------------------	
			
			Order order = new Order();
			
			OrderItem item1 = new OrderItem(new Menu("AAA", 1000), 3);
			OrderItem item2 = new OrderItem(new Menu("BBB", 2000), 6);
			
			ArrayList<OrderItem> itemList = new ArrayList<>();
			itemList.add(item1);
			itemList.add(item2);
			
			order.setItems(itemList);
			
			msgMap.put("order", order);
			
			Gson gson1 = new Gson();
			String message = gson1.toJson(msgMap); 
			
			System.out.println(order);

			
			//--------------------------------------
			
			
			// 서버에 파일을 주고
			dos.writeUTF(message);
			
			System.out.println("==========================================");
			// 서버의 파일을 읽는다.
			String serverMessage = din.readUTF();
			System.out.println("server message : " + serverMessage);
			System.out.println("==========================================");
			
			
			
		} catch(Exception e) {
			System.out.println("문제 발생");
		} finally {
			System.out.println("클라이언트 종료");
		}
		
	}
	
}
