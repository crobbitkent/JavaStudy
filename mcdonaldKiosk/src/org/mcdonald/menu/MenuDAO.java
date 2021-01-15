package org.mcdonald.menu;

import java.util.ArrayList;
import java.util.Map;

import lombok.Getter;

public abstract class MenuDAO {
	@Getter
	protected Map<String, Menu> menuMap;
	@Getter
	protected ArrayList<Menu> sideMenu;
	@Getter
	protected ArrayList<Menu> desertMenu;
	@Getter
	protected ArrayList<Menu> burgerMenu;
	@Getter
	protected ArrayList<Menu> setMenu;
	@Getter
	protected ArrayList<Menu> beverageMenu;

	
	protected abstract Map<String, Menu> readData();
	protected abstract Grade convertGrade(String grade); 
	protected abstract void findUpgradeMenu(ArrayList<Menu> arr);
}
