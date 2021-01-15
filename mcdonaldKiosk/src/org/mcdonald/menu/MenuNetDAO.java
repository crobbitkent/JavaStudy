package org.mcdonald.menu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import lombok.Getter;

public class MenuNetDAO extends MenuDAO{
//	@Getter
//	protected Map<String, Menu> menuMap;
//	@Getter
//	protected ArrayList<Menu> sideMenu;
//	@Getter
//	protected ArrayList<Menu> desertMenu;
//	@Getter
//	protected ArrayList<Menu> burgerMenu;
//	@Getter
//	protected ArrayList<Menu> setMenu;
//	@Getter
//	protected ArrayList<Menu> beverageMenu;
	
	
	@Override
	protected Map<String, Menu> readData() {
		// TODO Auto-generated method stub
		if(null != menuMap) {
			return menuMap;
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
			
			this.menuMap = gson.fromJson(jsonStr,  (Map<String, Menu>).class);
			
		}catch(Exception e) {
			throw e;
		}

		return menuMap;
	}

	@Override
	protected Grade convertGrade(String grade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void findUpgradeMenu(ArrayList<Menu> arr) {
		// TODO Auto-generated method stub
		
	}

}
