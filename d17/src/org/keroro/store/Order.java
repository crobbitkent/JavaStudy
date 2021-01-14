package org.keroro.store;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.Getter;



@Getter
@Data
public class Order {
	// 번호는 서버에서

	
	List<OrderItem> items;
	
	public Order() {
		items = new ArrayList<>();
	}
}
