package org.kiosk.ui;

import java.util.Scanner;

abstract class BaseUI {

	private Scanner scanner;
	
	BaseUI(Scanner scanner) {
		this.scanner = scanner;
	}
	
	protected void print(Object msg) {
		System.out.println(msg);
	}
	
	protected String inputStr(Object msg) {
		System.out.println(msg);
		
		return scanner.nextLine();
	}
	
	protected int inputInt(Object msg) {
		
		return Integer.parseInt(inputStr(msg));
	}
	
	protected double inputDouble(Object msg) {
		
		return Double.parseDouble(inputStr(msg));
	}
	
	public abstract void show()throws Exception;
}
