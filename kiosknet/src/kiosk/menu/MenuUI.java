package kiosk.menu;

import java.util.ArrayList;

import kiosk.util.BaseUI;
import lombok.AllArgsConstructor;
import lombok.Setter;


public class MenuUI extends BaseUI {
	@Setter
	private MenuService service;
	
	public MenuUI(MenuService service) {
		this.service = service;
	}
	
	public MenuUI() {
	}

	public void showAllMenus() {
		ArrayList<Menu> arr = service.getAllMenus();

		showAllMenus(arr);

	}

	public void showAllMenus(ArrayList<Menu> arr) {

		print("-----------------------");
		print("----------MENUS--------");
		print("-----------------------");

		for (int i = 0; i < arr.size(); i++) {
			Menu menu = arr.get(i);
			print(i + ": " + menu.getName() + ": " + menu.getPrice());
		}
		print("-----------------------");
	}

}
