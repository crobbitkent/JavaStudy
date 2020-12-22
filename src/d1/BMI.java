package d1;

import java.util.Scanner;

public class BMI {

	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		// 신장 입력
		System.out.println("신장을 입력하세요. (cm)");
		double height = scanner.nextDouble() * 0.01;
		// 무게 입력
		System.out.println("체중을 입력하세요. (kg)");
		double weight = scanner.nextDouble();
			
		double result = weight / (height * height);
		
		if (18.5 >= result)
		{
			System.out.println("저체중입니다.");
		}
		else if (23.0 >= result)
		{
			System.out.println("정상입니다.");
		}
		else if (25 >= result)
		{
			System.out.println("과체중입니다.");
		}
		else
		{
			System.out.println("비만입니다.");
		}		
		
		System.out.println("BMI 지수 = " + result);
	}
}
