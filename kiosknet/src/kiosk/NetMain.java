package kiosk;

import java.util.Scanner;

import kiosk.menu.MenuUI;
import kiosk.net.KioskClient;
import kiosk.order.OrderUI;

public class NetMain {
	public static void main(String[] args) {
		KioskClient client = new KioskClient();
		
		Scanner scanner = new Scanner(System.in);
		
		MenuUI menuUi = new MenuUI();
		menuUi.setScanner(scanner);
		OrderUI orderUi = new OrderUI();
		orderUi.setScanner(scanner);
		
		client.setKeyScanner(scanner);
		client.setMenuUi(menuUi);
		client.setOrderUi(orderUi);
		
		client.start();
	}
}
