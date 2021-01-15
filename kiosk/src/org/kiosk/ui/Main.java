package org.kiosk.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.kiosk.dao.MenuDAO;
import org.kiosk.dao.OrderDAO;
import org.kiosk.servie.MenuService;
import org.kiosk.servie.OrderService;

// client
public class Main {

	public static void main(String[] args)throws Exception {
		
		Scanner scanner  = new Scanner(System.in);
		
		MenuDAO menuDAO = new MenuDAO();
		MenuService menuService = new MenuService(menuDAO);
		MenuUI menuUI = new MenuUI(scanner, menuService);
		
		OrderDAO orderDAO = new OrderDAO();
		OrderService orderService = new OrderService(orderDAO);
		
		OrderUI orderUI = new OrderUI(scanner, menuService, orderService);
		
		List<BaseUI> uiList = new ArrayList<>();
		uiList.add(menuUI);
		uiList.add(orderUI);
		
		FrontUI ui = new FrontUI(scanner, uiList);
		ui.show();
		
		
		
	}//end main
}
