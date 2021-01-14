package kiosk.order;

import kiosk.menu.Menu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class OrderItem {

	private Menu menu;
	private int qty;
	
	public int getItemPrice() {
		return menu.getPrice() * qty;
	}
	
}



