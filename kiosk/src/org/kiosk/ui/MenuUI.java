package org.kiosk.ui;

import java.util.Scanner;

import org.kiosk.domain.Menu;
import org.kiosk.servie.MenuService;

public class MenuUI extends BaseUI{
	
	private MenuService menuService;

	public MenuUI(Scanner scanner, MenuService menuService) {
		super(scanner);
		this.menuService = menuService;
	}

	@Override
	public void show() throws Exception {
		
		print("메뉴를 보여줍니다.");
		
		Menu[] menus = menuService.getAllMenus();
		
		for (Menu menu : menus) {
			print(menu);
			print("---------------------");
		}
		
	}

}
