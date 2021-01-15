package org.kiosk.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import org.kiosk.domain.Order;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class OrderDAO {

	public Order saveOrder(Order order)throws Exception{
		
		try(Socket socket = new Socket("127.0.0.1", 5555);
				DataInputStream din = new DataInputStream(socket.getInputStream());
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				){
		
			JsonObject jobj = new JsonObject();
			jobj.addProperty("oper", "O");
			
			Gson gson = new Gson();
			jobj.addProperty("order",gson.toJson(order));
			
			dos.writeUTF(gson.toJson(jobj));
			
			String serverMsg = din.readUTF();
			
			Order orderResult = new Gson().fromJson(serverMsg, Order.class);
			
			return orderResult;
			
		}catch(Exception e) {
			throw e;
		}
		
	}
}
