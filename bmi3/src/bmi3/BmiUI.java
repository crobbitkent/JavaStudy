package bmi3;

import java.util.Scanner;

public class BmiUI {
	private Scanner scanner;
	private BmiCalculator calculator;
	
	
	public BmiUI(Scanner scanner, BmiCalculator calculator) {
		super();
		this.scanner = scanner;
		this.calculator = calculator;
	}


	public void play() {

		double h = 180;
		double w = 70;
		
		double result = calculator.calc(h, w);
		
	}
}
