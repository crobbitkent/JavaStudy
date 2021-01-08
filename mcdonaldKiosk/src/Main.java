import java.util.Scanner;

import org.mcdonald.menu.BurgerMenu;
import org.mcdonald.menu.Menu;
import org.mcdonald.menu.MenuService;
import org.mcdonald.menu.MenuUI;
import org.mcdonald.menu.SideMenu;
import org.mcdonald.order.OrderUI;

public class Main {

	public static void main(String[] args) {
		System.out.println("���α׷��� ���۵Ǿ����ϴ�.");
		
		
		// �޴� ����
		Menu[] arr = new Menu[5];
		arr[0] = new BurgerMenu("����", 5900, "����");
		arr[1] = new BurgerMenu("�Ұ�����", 4900, "����");
		arr[2] = new BurgerMenu("ġ����Ʈ��", 7900, "����");
		arr[3] = new SideMenu("����Ƣ��", 1800, "���̵�");
		arr[4] = new SideMenu("�ݶ�", 1200, "����");
		arr[4] = new SideMenu("�ݶ� ����", 1500, "����");
		arr[4] = new SideMenu("����Ƣ�� ����", 2200, "����");
		arr[0] = new BurgerMenu("���� ��Ʈ", 7900, "����");
		arr[1] = new BurgerMenu("�Ұ����� ��Ʈ", 5600, "����");
		arr[2] = new BurgerMenu("ġ����Ʈ�� ��Ʈ", 9200, "����");
		
		MenuService menuService = new MenuService(arr);
		
		// UI
		Scanner scanner = new Scanner(System.in);

		MenuUI menuUI = new MenuUI(menuService);
		menuUI.setScanner(scanner);
		
		OrderUI orderUI = new OrderUI(menuService);
		orderUI.setScanner(scanner);
		
		MainUI mainUI = new MainUI(menuUI, orderUI);
		
		// ������ ����
		mainUI.setScanner(scanner);
		// ������
		mainUI.init();
		
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
