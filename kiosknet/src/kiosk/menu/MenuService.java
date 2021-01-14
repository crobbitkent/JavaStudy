package kiosk.menu;

import java.util.ArrayList;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MenuService {

	@NonNull
	private ArrayList<Menu> menus;
	
	public ArrayList<Menu> getAllMenus() {
		
		return menus;
		
	}

	public Menu getMenu(int menuIndex) {
		return menus.get(menuIndex);
	}
}


