package org.kiosk.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderItem {

	private Menu menu;
	private int qty;
}
