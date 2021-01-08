package org.mcdonald.order;

import java.util.ArrayList;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Order {
	private static int COUNT;
	private int orderNumber; // 주문의 고유 번호
	private ArrayList<OrderItem> orderItems; // 주문 내용들
	
	public Order(ArrayList<OrderItem> items) {
		orderItems = items;
		COUNT = ++orderNumber;
	}
	
	public double getTotalPrice() {
		double result = 0; 
		
		for(OrderItem item : orderItems) {
			 result += item.getPrice();
		 }
		
		return result;
	}
	
//	public void setOrderItems(ArrayList<OrderItem> items) {
//		orderItems = items;
//	}
}
