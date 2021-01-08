package org.mcdonald.menu;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MenuService {
	@NonNull
	private Menu[] menus;

	
	// ��� �޴��� ��ȯ
	public Menu[] getAllMenu() {
		return menus;
	}
	
	public Menu getMenuAt(int index) {
		return menus[index];
	}
}
