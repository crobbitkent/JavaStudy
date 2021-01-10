package org.mcdonald.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.mcdonald.util.ExcelReader;

import lombok.Getter;


public class MenuDAO {
	@Getter
	private Map<String, Menu> menuMap;
	
	// @Getter
	// private ArrayList<Menu> menus;
	@Getter
	private ArrayList<Menu> sideMenu;
	@Getter
	private ArrayList<Menu> desertMenu;
	@Getter
	private ArrayList<Menu> burgerMenu;
	@Getter
	private ArrayList<Menu> setMenu;
	@Getter
	private ArrayList<Menu> beverageMenu;

	private ExcelReader reader;
	
	//====================== CONSTRUCTOR =======================//
	public MenuDAO(String fileName) {
		reader = new ExcelReader(fileName);
		menuMap = new HashMap<String, Menu>();
		// menus = new ArrayList<Menu>();
		sideMenu = new ArrayList<Menu>();
		desertMenu = new ArrayList<Menu>();
		burgerMenu = new ArrayList<Menu>();
		setMenu = new ArrayList<Menu>();
		beverageMenu = new ArrayList<Menu>();
		
		readFile();
	}
	
	//====================== METHOD =======================//
	
	public Menu getMenuAt(int index) {
		return menuMap.get(index + "");
	}
	
	// 파일에서 받아오기
	private void readFile() {
		int totalCount = reader.getLastRowNum();
		
		for(int i = 0; i < totalCount; ) {
			int j = 0;
			// 데이터 받아오기
			String name = reader.getCellString(i, j++);
			int price = reader.getCellInt(i, j++);
			String category = reader.getCellString(i, j++);
			String grade = reader.getCellString(i, j++);			
			
			// 메뉴 생성 후 넣기
			Menu menu = null;		
			
			switch(category) {
			case "사이드" :
				menu = new SideMenu(name, price, category, convertGrade(grade));
				sideMenu.add(menu);
				break;
			case "음료":
				menu = new SideMenu(name, price, category, convertGrade(grade));
				beverageMenu.add(menu);
				break;
			case "디저트":
				menu = new SideMenu(name, price, category, convertGrade(grade));
				desertMenu.add(menu);
				break;
				
			case "라지 세트" :
				menu = new BurgerMenu(name, price, category, convertGrade(grade));
				setMenu.add(menu);
				break;
			case "세트" :
				menu = new BurgerMenu(name, price, category, convertGrade(grade));
				setMenu.add(menu);
				break;
			case "버거" :
				menu = new BurgerMenu(name, price, category, convertGrade(grade));
				burgerMenu.add(menu);
				break;
			}
			
			menuMap.put(++i + "", menu);

			
		}
		
		findUpgradeMenu(sideMenu);
		findUpgradeMenu(burgerMenu);
		findUpgradeMenu(setMenu);
		findUpgradeMenu(beverageMenu);
	}
	

	private void findUpgradeMenu(ArrayList<Menu> arr) {
		int size = arr.size();
		
		for(int i = 0; i < size; ++i) {
			Menu menu1 = arr.get(i);
			for(int j = 0; j < size; ++j) {
				Menu menu2 = arr.get(j);
				int grade1 = menu1.getGrade().ordinal(); 
				int grade2 = menu2.getGrade().ordinal();
				
				if(menu1.getName().equals(menu2.getName())) {
					if(++grade1 == grade2) {
						menu1.setUpgradeMenu(menu2);
					}
				}				
			}	// for j end		
		}	// for i end	
	}

	private Grade convertGrade(String grade) {
		Grade result = Grade.small;
		
		switch(grade) {
		case "S":
			result = Grade.small;
			break;
		case "M":
			result = Grade.medium;
			break;
		case "L":	
			result = Grade.large;
			break;
		default :
			result = Grade.none;
		}
		
		return result;
	}
	
}
