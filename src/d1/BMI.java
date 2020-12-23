package d1;

import java.util.Scanner;

public class BMI
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		// 키를 입력
		System.out.println("본인의 키를 입력하세요. (cm)");
		double height = scanner.nextDouble() * 0.01;
		
		// 몸무게를 입력
		System.out.println("본인의 몸무게를 입력하세요. (kg)");
		double weight = scanner.nextDouble();
		
		// bmi 수치 변수
		double result = weight / (height * height);
		
		// 결과 문자 변수
		String resultString = "";
		
		if (18.5 >= result)
		{
			resultString = "저체중입니다.";
		}
		else if (23.0 >= result)
		{
			resultString = "보통입니다.";
		}
		else if (25 >= result)
		{
			resultString = "과다체중입니다.";
		}
		else
		{
			resultString = "비만입니다.";
		}		
		
		System.out.println("당신은 " + resultString);	
		System.out.println("BMI 수치 = " + result);		
	}
}
