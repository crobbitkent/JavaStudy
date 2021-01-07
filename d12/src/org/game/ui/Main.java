package org.game.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Map<String, BaseUI> map = new HashMap<>();
		map.put("BBB", new BBBUI(scanner));
		
		MainUI mainUI = new MainUI(scanner, map);
		
		mainUI.onPower();
		
		
	}
}



