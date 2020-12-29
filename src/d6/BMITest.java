package d6;

import java.util.Scanner;

public class BMITest {
	public static void main(String[] args) {
		// 재료
		Scanner scanner = new Scanner(System.in);
		
		
		// 로직
		System.out.println("Write your name.");
		String name = scanner.nextLine();
		
		System.out.println("Write your height."); 
		double height = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Write your weight."); 
		double weight = Double.parseDouble(scanner.nextLine());
		
		// 객체 생성
		PersonData person1 = new PersonData(name, height, weight);
		
		double bmi = person1.calcBMI();
		
		System.out.println(bmi);
	}
}
