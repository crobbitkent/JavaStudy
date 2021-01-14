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
		print("�ֹ��� �ްڽ��ϴ�.");

		ArrayList<OrderItem> items = new ArrayList<>();

		while (true) {
			// �޴���ȣ�� �Է� �޴´�.
			int menuIndex = inputInt("�޴� ��ȣ�� �Է��ϼ���");
			// �ش� �޴��� �����´�.
			Menu menu = service.getMenu(menuIndex);
			// �޴��� ������ �Է� �޴´�.
			int qty = inputInt("������ �Է��ϼ���.(1�̻� �Է��ϼ���)");

			// OrderItem ��ü�� ����
			OrderItem orderItem = new OrderItem(menu, qty);
			// items�� �߰�
			items.add(orderItem);

			// �ֹ��� �߰��Ұ���
			String answer = inputStr("�׸� �Ͻ÷��� n");
			if (answer.equals("n")) {
				break;
			}

		} // end while

		// Order�� ����
		Order order = new Order(items);

		return order;
	}
	
	public void printOrder(Order order) {
		// Order�� ���
				print("OREDR NUM: " + order.getOrderNum());

				print("--------------------------------");
				for (OrderItem orderItem : order.getItems()) {
					print(orderItem.getMenu().getName() + "   " + orderItem.getQty() + " " + orderItem.getItemPrice());
				}
				print("=================================");
				print("TOTAL: " + order.getTotal());
	}

}
