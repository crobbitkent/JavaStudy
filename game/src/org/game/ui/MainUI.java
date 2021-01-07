package org.game.ui;

import java.util.Map;
import java.util.Scanner;

public class MainUI extends BaseUI {

	private Map<String, BaseUI> uiMap;

	//============================CONSTRUCTOR========================//
	public MainUI(Scanner scanner, Map<String, BaseUI> uiMap) {
		super(scanner);
		// TODO Auto-generated constructor stub
		this.uiMap = uiMap;
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		String select = inputStr("� ������ �Ͻðڽ��ϱ�?");
		BaseUI ui = uiMap.get(select);
		ui.playGame();
		
	}
}
