package org.kiosk.dao.test;

import org.junit.Before;
import org.junit.Test;
import org.kiosk.dao.MenuDAO;
import org.kiosk.domain.Menu;

public class MenuDAOTest {

	MenuDAO dao;
	
	@Before
	public void ready() {
		dao = new MenuDAO();
		
	}
	
	@Test
	public void testGetAllMenus()throws Exception {
		
		Menu[] arr = dao.getAllMenus();
		
		for (Menu menu : arr) {
			System.out.println(menu);
		}
		
	}

}
