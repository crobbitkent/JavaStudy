package org.kiosk.domain;

import java.util.List;

import lombok.Data;

@Data
public class Order {

	private int ordernum;
	
	private List<OrderItem> items;
}
