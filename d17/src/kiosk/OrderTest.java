package kiosk;

import java.util.ArrayList;

import org.keroro.store.Menu;
import org.keroro.store.Order;
import org.keroro.store.OrderItem;

import com.google.gson.Gson;

public class OrderTest {
	
	public static void main(String[] args) throws Exception {
		Order order = new Order();
		
		OrderItem item1 = new OrderItem(new Menu("AAA", 1000), 3);
		OrderItem item2 = new OrderItem(new Menu("BBB", 2000), 6);
		
		ArrayList<OrderItem> itemList = new ArrayList<>();
		itemList.add(item1);
		itemList.add(item2);
		
		order.setItems(itemList);
		
		System.out.println(order);
		
		// order를 json으로 변환!
		Gson gson = new Gson();
		String str = gson.toJson(order);
		
		System.out.println(str);
		
		// json에서 order 객체로 변환
		Object obj = gson.fromJson(str, Order.class);
	}
	
}
