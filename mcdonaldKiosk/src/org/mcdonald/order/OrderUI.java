package org.mcdonald.order;

import java.util.ArrayList;

import org.mcdonald.menu.Menu;
import org.mcdonald.menu.MenuService;
import org.mcdonald.util.BaseUI;

public class OrderUI extends BaseUI {
	private MenuService menuService;
	
	public OrderUI(MenuService menuService) {
		super();
		this.menuService = menuService;
	}



	// 주문을 생성해서 정보를 계속 추가
	// 주문을 출력
	public void makeOrder() {
		// Order order = new Order();
		// 리스트 생성
		ArrayList<OrderItem> items = new ArrayList<OrderItem>();
		
		// 루프
		while (true) {
			// 1. 어떤 메뉴를 선택?
			int select = inputInt("메뉴 번호를 입력하세요.");
			
			Menu menu = menuService.getMenuAt(select-1);
			
			// 1-05. 메뉴가 있었는지 확인
			
			
			// 1-1. 사이드 메뉴라면 업그레이드 가능!
			// 버거가 아닌 카테고리는 사이드 메뉴
			// 업그레이드가 가능하다.
			if("버거" != menu.getCategory()) {
				String isUpgrade = inputString("업그레이드 하시겠습니까?");
				
				if(false == isUpgrade.equals("n")) {
					menu.upgrade();
					// print("업그레이드 되었습니다. (추가금액 : " + extra + ")" );
				}
			}
					
			// 2. 수량을 입력
			int qty = inputInt("수량을 입력하세요.");
			
			// OrderItem 객체 생성, list에 추가
			OrderItem item = new OrderItem(menuService.getMenuAt(select-1), qty);
			
			// 중복 체크 후 List에 넣기
			checkSameItem(item, items);		
			
			// 3. 메뉴 추가할래? (y/n)
			String isAdd = inputString("메뉴를 추가하시겠습니까?(y/n)");
			
			// 답이 y가 아니라면 루프 종료
			if(true == isAdd.equals("n")) {
				break;
			}
			
		} // 루프 끝

		
		
		// Order를 생성
		Order order = new Order(items);
		
		// 주문 내역을 출력
		printContents(order);
	}
	
	private void checkSameItem(OrderItem item, ArrayList<OrderItem> items) {
		int size = items.size();
		for(int i = 0; i > size; ++i) {
			String name1 = item.getMenu().getName();
			String name2 = items.get(i).getMenu().getName();
			
			// 같은게 있으면 수량만 올린다.
			if(name1.equals(name2)) {
				items.get(i).addQuantity(item.getQty());
			// 아니면 리스트에 추가한다. 
			} else {
				items.add(item);	
			}
		}
		
		
	}
	
	
	
	private void printContents(Order order) {

		print("");
		print("ORDER NUMBER : " + order.getOrderNumber() );
		// 주문 내역 출력
		print("================ 주문 내역 ==================");
		
		for(OrderItem item : order.getOrderItems()) {
			print( item.getMenu().getName() + "   " + item.getQty() + "   " + item.getPrice() );
		}
		
		print("------------------------------------------");
		print("TOTAL : " + order.getTotalPrice());
		print("==========================================");
	}
}
