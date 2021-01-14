package kiosk.order;

import java.util.ArrayList;

import kiosk.menu.Menu;
import kiosk.menu.MenuService;
import kiosk.util.BaseUI;
import lombok.AllArgsConstructor;
import lombok.Setter;


public class OrderUI extends BaseUI {
	@Setter
	private MenuService service;

	public Order makeOrder() {
		print("주문을 받겠습니다.");

		ArrayList<OrderItem> items = new ArrayList<>();

		while (true) {
			// 메뉴번호를 입력 받는다.
			int menuIndex = inputInt("메뉴 번호를 입력하세요");
			// 해당 메뉴를 가져온다.
			Menu menu = service.getMenu(menuIndex);
			// 메뉴의 수량을 입력 받는다.
			int qty = inputInt("수량을 입력하세요.(1이상 입력하세요)");

			// OrderItem 객체를 생성
			OrderItem orderItem = new OrderItem(menu, qty);
			// items에 추가
			items.add(orderItem);

			// 주문을 추가할건지
			String answer = inputStr("그만 하시려면 n");
			if (answer.equals("n")) {
				break;
			}

		} // end while

		// Order를 생성
		Order order = new Order(items);

		return order;
	}
	
	public void printOrder(Order order) {
		// Order를 출력
				print("OREDR NUM: " + order.getOrderNum());

				print("--------------------------------");
				for (OrderItem orderItem : order.getItems()) {
					print(orderItem.getMenu().getName() + "   " + orderItem.getQty() + " " + orderItem.getItemPrice());
				}
				print("=================================");
				print("TOTAL: " + order.getTotal());
	}

}
