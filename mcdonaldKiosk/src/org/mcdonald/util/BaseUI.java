package org.mcdonald.util;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Setter;


// UI의 기본 기능들 구현
@Setter
public abstract class BaseUI {
	private Scanner scanner;


	protected void print(String out) {
		System.out.println(out);
	}

	// 입력 받기 (string)
	protected String inputString(String message) {
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
