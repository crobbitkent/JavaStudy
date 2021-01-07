package org.game.ui;

import java.util.Scanner;

public abstract class BaseUI {
	private Scanner scanner;

	public BaseUI(Scanner scanner) {
		this.scanner = scanner;
	}

	public abstract void playGame();

	//===============================UTIL METHOD===============================//
	protected void print(String out) {
		System.out.println(out);
	}

	// 입력 받기 (string)
	protected String inputStr(String message) {
		print(message);
		return scanner.nextLine();
	}

	// 입력 받은걸 int로
	protected int inputInt(String message) {
		print(message);
		return Integer.parseInt(scanner.nextLine());
	}

	// 입력 받은걸 double로
	protected double inputDouble(String message) {
		print(message);
		return Double.parseDouble(scanner.nextLine());
	}
}
