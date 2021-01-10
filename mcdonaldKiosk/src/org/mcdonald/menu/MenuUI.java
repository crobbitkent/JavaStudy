package org.mcdonald.menu;

import java.util.ArrayList;
import java.util.Map;

import org.mcdonald.util.BaseUI;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MenuUI extends BaseUI {

	private MenuService service;

	// 모든 메뉴 출력
	public void showAllMenu() {
		print("==================== MENU ======================");
	
		Map<String, Menu> menuMap = service.getAllMenu();
		int length = menuMap.size();
		
		
		for(int i = 0; i < length; )
		{
			Menu menu = menuMap.get(++i + "");
			print("[" + i + "] " + menu.getTotalName() + " : " + (int)menu.getPrice() + "원");
			
			// 디버그
//			if(null != menu.getUpgradeMenu())
//				{
//					print("[" + i + "] " + menu.getUpgradeMenu().getTotalName());
//				}
		}

		
		print("================================================");
	}
	
	
}
