import java.util.Scanner;

import org.mcdonald.db.DbManager;
import org.mcdonald.menu.BurgerMenu;
import org.mcdonald.menu.Menu;
import org.mcdonald.menu.MenuDAO;
import org.mcdonald.menu.MenuService;
import org.mcdonald.menu.MenuUI;
import org.mcdonald.menu.SideMenu;
import org.mcdonald.order.OrderUI;

public class Main {

	public static void main(String[] args) {
		System.out.println("���α׷��� ���۵Ǿ����ϴ�.");
		
		// dao ����
		MenuDAO dao = new MenuDAO("C:\\testDB\\mcdonaldMenu.xlsx");
		
		// �޴� ����

		
		MenuService menuService = new MenuService(dao);
		
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
	
	private void dbSetUp() {
		DbManager dbm = new DbManager();
		dbm.connection();
	}

}
