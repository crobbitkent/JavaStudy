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
		System.out.println("프로그램이 시작되었습니다.");
		
		// dao 생성
		MenuDAO dao = new MenuDAO("C:\\testDB\\mcdonaldMenu.xlsx");
		
		// 메뉴 서비스

		
		MenuService menuService = new MenuService(dao);
		
		// UI
		Scanner scanner = new Scanner(System.in);

		MenuUI menuUI = new MenuUI(menuService);
		menuUI.setScanner(scanner);
		
		OrderUI orderUI = new OrderUI(menuService);
		orderUI.setScanner(scanner);
		
		MainUI mainUI = new MainUI(menuUI, orderUI);
		
		// 의존성 주입
		mainUI.setScanner(scanner);
		// 진입점
		mainUI.init();
		
		
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	private void dbSetUp() {
		DbManager dbm = new DbManager();
		dbm.connection();
	}

}
