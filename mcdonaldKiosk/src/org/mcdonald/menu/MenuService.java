package org.mcdonald.menu;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MenuService {
	@NonNull
	private Menu[] menus;

	
	// 모든 메뉴를 반환
	public Menu[] getAllMenu() {
		return menus;
	}
	
	public Menu getMenuAt(int index) {
		return menus[index];
	}
}
