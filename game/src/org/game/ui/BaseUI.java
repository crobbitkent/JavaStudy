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

	// �Է� �ޱ� (string)
	protected String inputStr(String message) {
		print(message);
		return scanner.nextLine();
	}

	// �Է� ������ int��
	protected int inputInt(String message) {
		print(message);
		return Integer.parseInt(scanner.nextLine());
	}

	// �Է� ������ double��
	protected double inputDouble(String message) {
		print(message);
		return Double.parseDouble(scanner.nextLine());
	}
}
