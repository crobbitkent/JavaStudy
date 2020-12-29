package d6;

import java.util.Scanner;

public class BMITest {
	public static void main(String[] args) {
		// 犁丰
		Scanner scanner = new Scanner(System.in);
		
		
		// 肺流
		System.out.println("Write your name.");
		String name = scanner.nextLine();
		
		System.out.println("Write your height."); 
		double height = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Write your weight."); 
		double weight = Double.parseDouble(scanner.nextLine());
		
		// 按眉 积己
		PersonData person1 = new PersonData(name, height, weight);
		
		double bmi = person1.calcBMI();
		
		System.out.println(bmi);
	}
}
