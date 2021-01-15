package org.kiosk.servie;

import org.kiosk.dao.MenuDAO;
import org.kiosk.domain.Menu;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MenuService {

	private MenuDAO dao;
	
	public Menu[] getAllMenus() throws Exception{
		
		return dao.getAllMenus();
	}
	
	public Menu getMenu(int idx) {
		return dao.getMenByIndex(idx);
	}
}
