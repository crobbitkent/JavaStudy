package d6;

import java.util.Scanner;

public class BMITest {
	public static void main(String[] args) {
		// ���
		Scanner scanner = new Scanner(System.in);
		
		
		// ����
		System.out.println("Write your name.");
		String name = scanner.nextLine();
		
		System.out.println("Write your height."); 
		double height = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Write your weight."); 
		double weight = Double.parseDouble(scanner.nextLine());
		
		// ��ü ����
		PersonData person1 = new PersonData(name, height, weight);
		
		double bmi = person1.calcBMI();
		
		System.out.println(bmi);
	}
}
