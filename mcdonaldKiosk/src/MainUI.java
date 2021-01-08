import java.util.Scanner;

import org.mcdonald.menu.MenuUI;
import org.mcdonald.order.OrderUI;
import org.mcdonald.util.BaseUI;

import lombok.AllArgsConstructor;



@AllArgsConstructor
public class MainUI extends BaseUI {
	
	private MenuUI menuUI;
	private OrderUI orderUI;
	
	// 최초 진입 메서드
	public void init() {
		String start = inputString("Enter를 누르시면 주문이 시작됩니다.(n=종료)");
		
		if(true == start.equals("n")) {
			return;
		}
		
		print("메뉴를 보여드리겠습니다.");

		// 메뉴 출력
		menuUI.showAllMenu();
	
		// 주문 생성
		orderUI.makeOrder();
		
		// 재귀 함수
		init();	

	}

	
	
}
