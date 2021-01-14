package org.keroro.store;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class OrderItem {
	private Menu menu;
	private int qty;
}
