package org.kiosk.server.task;

import java.io.DataOutputStream;

import org.kiosk.domain.Order;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class OrderTask implements Task {
	
	private static int sequence = 0;

	@Override
	public void runTask(JsonElement req, DataOutputStream dos) throws Exception {

		JsonObject reqObj = req.getAsJsonObject();
		
		//System.out.println(reqObj);
		
		JsonElement orderEle = reqObj.get("order");
		
		//System.out.println(orderEle);
		
		Order order = new Gson().fromJson(orderEle.getAsString(), Order.class);
		
		//System.out.println(order);
		
		order.getItems().forEach(item -> System.out.println(item));
		
		order.setOrdernum(++sequence);
		
		dos.writeUTF(new Gson().toJson(order));
	}

}
