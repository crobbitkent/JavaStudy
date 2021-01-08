package org.mcdonald.order;

import org.mcdonald.menu.Menu;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class OrderItem {
// ������ �ֹ� �׸�
	private Menu menu; // �޴�
	private int qty; // ����

	// ������ 1
	public OrderItem(Menu menu, int qty) {
		this.menu = menu;
		this.qty = qty;
	}
	
	// ������ 2
	public OrderItem(Menu menu) {
		this.menu = menu;
		this.qty = 1;
	}
	
	// �� ����
	public double getPrice() {
		return menu.getPrice() * qty;
	}
	
	public void addQuantity(int qty) {
		this.qty += qty;
	}
	
}
