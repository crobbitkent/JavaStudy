package bmi3;

import java.util.Scanner;

public class Main {

	public Main() {
		 BmiCalculator bmi = new BmiCalculatorImpl();
		 Scanner scanner = new Scanner(System.in);
		 
		 BmiUI ui = new BmiUI(scanner, bmi);
		 
		 
	}

}
