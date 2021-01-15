package org.kiosk.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.kiosk.domain.Order;
import org.kiosk.domain.OrderItem;
import org.kiosk.servie.MenuService;
import org.kiosk.servie.OrderService;

public class OrderUI extends BaseUI {
	
	private MenuService menuService;
	private OrderService orderService;

	public OrderUI(Scanner scanner, MenuService menuService, OrderService orderService) {
		super(scanner);
		this.menuService = menuService;
		this.orderService = orderService;
	}


	@Override
	public void show() throws Exception {
		
		Order order = new Order();
		List<OrderItem> items = new ArrayList<>();
		
		while(true) {
			int idx = inputInt("메뉴 번호를 선택하세요");
			
			int qty = inputInt("수량을 입력하세요");
			
			OrderItem item = new OrderItem(menuService.getMenu(idx), qty);
			items.add(item);
			
			if(inputStr("계속할까요?").equalsIgnoreCase("n")) {
				break;
			}//end if
			
		}//end while
		
		order.setItems(items);
		Order orderResult = orderService.sendOrder(order);
		
		print("-----------------주문 결과--------------------");
		print("ORDER NUM: "+ orderResult.getOrdernum());
		
		order.getItems().forEach(item -> {
			print(item);
			print("-----------------------");
		});
		print("============================");
		
	}

}










