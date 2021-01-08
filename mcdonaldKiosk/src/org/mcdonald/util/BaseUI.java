package org.mcdonald.util;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Setter;


// UI�� �⺻ ��ɵ� ����
@Setter
public abstract class BaseUI {
	private Scanner scanner;


	protected void print(String out) {
		System.out.println(out);
	}

	// �Է� �ޱ� (string)
	protected String inputString(String message) {
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
