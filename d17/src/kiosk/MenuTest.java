package kiosk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.keroro.store.Menu;

import com.google.gson.Gson;

public class MenuTest {
	
	public static void main(String[] args) throws Exception {
		
		Menu a = new Menu("빅맥", 6000);
		Menu b = new Menu("쿼터치즈버거", 7500);
		Menu c = new Menu("와퍼", 7000);
		
		List<Menu> menuList = new ArrayList<Menu>();
		
		menuList.add(a);
		menuList.add(b);
		menuList.add(c);
		
		Gson gson = new Gson();
		String jsonStr = gson.toJson(menuList);
		
		// System.out.println(jsonStr);
		
		// List<Menu> list = gson.fromJson(jsonStr, menuList.getClass());
		// list.forEach(  m ->System.out.println(m) );

		Menu[] arr = gson.fromJson(jsonStr, Menu[].class);
				
		System.out.println(Arrays.toString(arr));
	}
}
