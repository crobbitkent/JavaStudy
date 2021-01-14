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

public class DataClient3 {

	//badcode
	public static void main(String[] args)throws Exception {

		Map<String, Object> msgMap = new HashMap<>();
		
		msgMap.put("oper", "O");

		//------------------------------------
		Order order = new Order();
		
		OrderItem item1 = new OrderItem(new Menu("AAA",1000),3);
		ArrayList<OrderItem> itemList = new ArrayList<>();
		itemList.add(item1);
		
		order.setItems(itemList);
		
		msgMap.put("order", itemList);

		Gson gson = new Gson();
		String msg = gson.toJson(msgMap);
		
		//-------------------------------------
		
		
		Socket socket = new Socket("127.0.0.1",5555);
		
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		DataInputStream din = new DataInputStream(socket.getInputStream());

		dos.writeUTF(msg);
	
		System.out.println("-----------------------");
		String line = din.readUTF();
		System.out.println(line);
		
		
		dos.close();
		socket.close();
	}
}
