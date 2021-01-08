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



	// �ֹ��� �����ؼ� ������ ��� �߰�
	// �ֹ��� ���
	public void makeOrder() {
		// Order order = new Order();
		// ����Ʈ ����
		ArrayList<OrderItem> items = new ArrayList<OrderItem>();
		
		// ����
		while (true) {
			// 1. � �޴��� ����?
			int select = inputInt("�޴� ��ȣ�� �Է��ϼ���.");
			
			Menu menu = menuService.getMenuAt(select-1);
			
			// 1-05. �޴��� �־����� Ȯ��
			
			
			// 1-1. ���̵� �޴���� ���׷��̵� ����!
			// ���Ű� �ƴ� ī�װ��� ���̵� �޴�
			// ���׷��̵尡 �����ϴ�.
			if("����" != menu.getCategory()) {
				String isUpgrade = inputString("���׷��̵� �Ͻðڽ��ϱ�?");
				
				if(false == isUpgrade.equals("n")) {
					menu.upgrade();
					// print("���׷��̵� �Ǿ����ϴ�. (�߰��ݾ� : " + extra + ")" );
				}
			}
					
			// 2. ������ �Է�
			int qty = inputInt("������ �Է��ϼ���.");
			
			// OrderItem ��ü ����, list�� �߰�
			OrderItem item = new OrderItem(menuService.getMenuAt(select-1), qty);
			
			// �ߺ� üũ �� List�� �ֱ�
			checkSameItem(item, items);		
			
			// 3. �޴� �߰��ҷ�? (y/n)
			String isAdd = inputString("�޴��� �߰��Ͻðڽ��ϱ�?(y/n)");
			
			// ���� y�� �ƴ϶�� ���� ����
			if(true == isAdd.equals("n")) {
				break;
			}
			
		} // ���� ��

		
		
		// Order�� ����
		Order order = new Order(items);
		
		// �ֹ� ������ ���
		printContents(order);
	}
	
	private void checkSameItem(OrderItem item, ArrayList<OrderItem> items) {
		int size = items.size();
		for(int i = 0; i > size; ++i) {
			String name1 = item.getMenu().getName();
			String name2 = items.get(i).getMenu().getName();
			
			// ������ ������ ������ �ø���.
			if(name1.equals(name2)) {
				items.get(i).addQuantity(item.getQty());
			// �ƴϸ� ����Ʈ�� �߰��Ѵ�. 
			} else {
				items.add(item);	
			}
		}
		
		
	}
	
	
	
	private void printContents(Order order) {

		print("");
		print("ORDER NUMBER : " + order.getOrderNumber() );
		// �ֹ� ���� ���
		print("================ �ֹ� ���� ==================");
		
		for(OrderItem item : order.getOrderItems()) {
			print( item.getMenu().getName() + "   " + item.getQty() + "   " + item.getPrice() );
		}
		
		print("------------------------------------------");
		print("TOTAL : " + order.getTotalPrice());
		print("==========================================");
	}
}
