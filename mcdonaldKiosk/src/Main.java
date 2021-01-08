import java.util.Scanner;

import org.mcdonald.menu.BurgerMenu;
import org.mcdonald.menu.Menu;
import org.mcdonald.menu.MenuService;
import org.mcdonald.menu.MenuUI;
import org.mcdonald.menu.SideMenu;
import org.mcdonald.order.OrderUI;

public class Main {

	public static void main(String[] args) {
		System.out.println("프로그램이 시작되었습니다.");
		
		
		// 메뉴 서비스
		Menu[] arr = new Menu[5];
		arr[0] = new BurgerMenu("와퍼", 5900, "버거");
		arr[1] = new BurgerMenu("불고기버거", 4900, "버거");
		arr[2] = new BurgerMenu("치즈콰트로", 7900, "버거");
		arr[3] = new SideMenu("감자튀김", 1800, "사이드");
		arr[4] = new SideMenu("콜라", 1200, "음료");
		arr[4] = new SideMenu("콜라 라지", 1500, "음료");
		arr[4] = new SideMenu("감자튀김 라지", 2200, "음료");
		arr[0] = new BurgerMenu("와퍼 세트", 7900, "버거");
		arr[1] = new BurgerMenu("불고기버거 세트", 5600, "버거");
		arr[2] = new BurgerMenu("치즈콰트로 세트", 9200, "버거");
		
		MenuService menuService = new MenuService(arr);
		
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

}
