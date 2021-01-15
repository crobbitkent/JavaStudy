package org.kiosk.server;

import java.util.HashMap;
import java.util.Map;

import org.kiosk.server.task.MenuTask;
import org.kiosk.server.task.OrderTask;
import org.kiosk.server.task.Task;


// server
public class Main {

	public static void main(String[] args)throws Exception {
		
		Map<String, Task> taskMap = new HashMap<>();
		
		taskMap.put("M", new MenuTask());
		taskMap.put("O", new OrderTask());
		
		StoreServer storeServer = new StoreServer(taskMap);
		
		storeServer.runServer();
		
	}
}
