import java.util.Scanner;

import org.mcdonald.menu.MenuUI;
import org.mcdonald.order.OrderUI;
import org.mcdonald.util.BaseUI;

import lombok.AllArgsConstructor;



@AllArgsConstructor
public class MainUI extends BaseUI {
	
	private MenuUI menuUI;
	private OrderUI orderUI;
	
	// ���� ���� �޼���
	public void init() {
		String start = inputString("Enter�� �����ø� �ֹ��� ���۵˴ϴ�.(n=����)");
		
		if(true == start.equals("n")) {
			return;
		}
		
		print("�޴��� �����帮�ڽ��ϴ�.");

		// �޴� ���
		menuUI.showAllMenu();
	
		// �ֹ� ����
		orderUI.makeOrder();
		
		// ��� �Լ�
		init();	

	}

	
	
}
