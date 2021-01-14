package kiosk;

import java.util.ArrayList;
import java.util.Scanner;

import kiosk.menu.Menu;
import kiosk.menu.MenuService;
import kiosk.menu.MenuUI;
import kiosk.order.OrderUI;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Menu> arr = new ArrayList<Menu>();
		arr.add(new Menu("와퍼",5900));
		arr.add(new Menu("불고기와퍼",4900));
		arr.add(new Menu("치즈쿼트로",7900));
		arr.add(new Menu("감자",1800));
		arr.add(new Menu("콜라",1800));
		
		MenuService service = new MenuService(arr);
		
		MenuUI menuUI  = new MenuUI(service);
		menuUI.setScanner(scanner);
		
		OrderUI orderUI = new OrderUI();
		orderUI.setScanner(scanner);
		
		MainUI mainUI = new MainUI(menuUI, orderUI);
		mainUI.setScanner(scanner);
		
		mainUI.welcome();
		
		
	}
}






