package org.mcdonald.menu;

import java.util.ArrayList;
import java.util.Map;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MenuService {
	@NonNull
	private MenuDAO dao;

	
	// ��� �޴��� ��ȯ
	public Map<String, Menu> getAllMenu() {
		return dao.getMenuMap();
	}
	
	public Menu getMenuAt(int index) {
		return dao.getMenuAt(index);
	}
}
