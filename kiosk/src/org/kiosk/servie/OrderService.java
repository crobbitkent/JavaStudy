package org.kiosk.servie;

import org.kiosk.dao.OrderDAO;
import org.kiosk.domain.Order;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OrderService {

	private OrderDAO orderDAO;
	
	public Order sendOrder(Order order)throws Exception {
		
		return orderDAO.saveOrder(order);
	}
}
