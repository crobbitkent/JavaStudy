package d1;

import java.util.Scanner;

// 12/22 화요일
public class Input 
{
	public static void main(String[] args)
	{
		// 도넛의 면적 구하기
		Scanner scanner = new Scanner(System.in);
		
		// 1. 반지름 받아오기
		System.out.println("원 1의 반지름을 입력하세요.");
		double radius1 = scanner.nextDouble();
		
		System.out.println("원 2의 반지름을 입력하세요.");
		double radius2 = scanner.nextDouble();
		
		// 2. 원 1번의 넓이
		double area1 = CalculateArea(radius1);
		// 3. 원 2번의 넓이
		double area2 = CalculateArea(radius2);
		
		// 4. 결과
		System.out.println("도넛의 넓이는 : " + Math.abs(area1 - area2));
	}
	
	private static double CalculateArea(double radius)
	{		
		return radius * radius * Math.PI;
	}
}
