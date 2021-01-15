package org.kiosk.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import org.kiosk.domain.Menu;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class MenuDAO {
	
	private Menu[] menus;

	public Menu[] getAllMenus()throws Exception  {
		
		if(menus != null) {
			return menus;
		}
		
		try(Socket socket = new Socket("127.0.0.1", 5555);
				DataInputStream din = new DataInputStream(socket.getInputStream());
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				){
		
			JsonObject jobj = new JsonObject();
			jobj.addProperty("oper", "M");
			
			dos.writeUTF(jobj.toString());
			
			String jsonStr = din.readUTF();
			
			Gson gson = new Gson();
			
			this.menus = gson.fromJson(jsonStr, Menu[].class);
			
		}catch(Exception e) {
			throw e;
		}
		return this.menus;
		
	}
	
	public Menu getMenByIndex(int index) {
		
		return menus[index];
	}
}
