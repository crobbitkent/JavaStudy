package org.game.ui;

import java.util.Scanner;

// 복불봅
public class LuckGameUI extends BaseUI {

	public LuckGameUI(Scanner scanner) {
		// 부모 클래스 생성자
		super(scanner);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void playGame() {
		print("지금부터 복불복 게임을 시작하지...");
		
		print("=======================================");
		print("복불복 게임 끝...");
		print("=======================================");
	}

	
	
}
