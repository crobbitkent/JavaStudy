package org.kiosk.server.task;


import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.kiosk.domain.Menu;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class MenuTask implements Task {

	@Override
	public void runTask(JsonElement req, DataOutputStream dos) throws Exception {

		System.out.println("menu data send");
		
		List<Menu> menuList = new ArrayList<>();
		menuList.add(new Menu("0번......", 1000));
		menuList.add(new Menu("1번......", 2000));
		menuList.add(new Menu("2번......", 3000));
		menuList.add(new Menu("3번......", 4000));
		menuList.add(new Menu("4번......", 5000));
		
		Gson gson = new Gson();
		
		dos.writeUTF(gson.toJson(menuList));
		
	}

}
