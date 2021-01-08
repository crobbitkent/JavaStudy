package org.mcdonald.order;

import org.mcdonald.menu.Menu;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class OrderItem {
// 각각의 주문 항목
	private Menu menu; // 메뉴
	private int qty; // 수량

	// 생성자 1
	public OrderItem(Menu menu, int qty) {
		this.menu = menu;
		this.qty = qty;
	}
	
	// 생성자 2
	public OrderItem(Menu menu) {
		this.menu = menu;
		this.qty = 1;
	}
	
	// 총 가격
	public double getPrice() {
		return menu.getPrice() * qty;
	}
	
	public void addQuantity(int qty) {
		this.qty += qty;
	}
	
}
