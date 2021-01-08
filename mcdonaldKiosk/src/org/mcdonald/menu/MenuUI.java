package org.mcdonald.menu;

import org.mcdonald.util.BaseUI;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MenuUI extends BaseUI {

	private MenuService service;

	// 모든 메뉴 출력
	public void showAllMenu() {
		print("==================== MENU ======================");
	
		Menu[] arr = service.getAllMenu();
		int length = arr.length;
		
		int i = 0;
		for(Menu menu : arr) {
			print("[" + ++i + "] " + menu.getName() + " : " + (int)menu.getPrice() + "원");
		}
		
		print("================================================");
	}
	
	
}
