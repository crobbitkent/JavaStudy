package org.kiosk.dao.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.kiosk.dao.OrderDAO;
import org.kiosk.domain.Menu;
import org.kiosk.domain.Order;
import org.kiosk.domain.OrderItem;

public class OrderDAOTest {

	OrderDAO dao;
	
	@Before
	public void ready() {
		dao = new OrderDAO();
		
	}
	
	@Test
	public void testSendOrder()throws Exception {
		
		Order order = new Order();
		List<OrderItem> items = new ArrayList<>();
		
		items.add(new OrderItem( new Menu("0빅맥",4000), 3));
		items.add(new OrderItem( new Menu("1빅맥",5000), 4));
		items.add(new OrderItem( new Menu("2빅맥",6000), 5));
		
		order.setItems(items);
		
		dao.saveOrder(order);
		
		
	}
}




