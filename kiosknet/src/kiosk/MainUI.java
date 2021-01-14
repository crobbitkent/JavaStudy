package kiosk;

import kiosk.menu.MenuUI;
import kiosk.order.OrderUI;
import kiosk.util.BaseUI;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MainUI extends BaseUI {

	private MenuUI menuUI;
	private OrderUI orderUI;
	
	
	public void welcome() {
		
		inputStr("시작하시려면 Enter해 주세요");
		
		print("지금부터 메뉴를 보여드리고 주문을 받겠습니다.");
		
		menuUI.showAllMenus();
		orderUI.makeOrder();
	
		
	}
}






