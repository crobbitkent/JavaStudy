package org.game.ui;

import java.util.Scanner;

public class RSPGameUI extends BaseUI {
	public RSPGameUI(Scanner scanner) {
		// 부모 클래스 생성자
		super(scanner);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void playGame() {
		print("지금부터 가위바위보 게임을 시작하지...");
		
		print("=======================================");
		print("가위바위보 게임 끝...");
		print("=======================================");

	}

	
	
}
