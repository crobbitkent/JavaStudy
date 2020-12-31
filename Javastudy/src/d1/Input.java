package d1;

import java.util.Scanner;

// 12/22 화요일
public class Input 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Degree(scanner);
	}
	
	
	// 섭씨를 화씨로 바꾸기 또는 화씨를 섭씨로 바꾸기
	private static void Degree(Scanner scanner)
	{
		System.out.println("섭씨->화씨는 1번, 화씨->섭씨는 2번입니다.");
		// 섭씨->화씨 : 1, 화씨->섭씨 : 2
		int select = scanner.nextInt();
		// 섭씨
		double degreeC = 0;
		// 화씨
		double degreeF = 0;
		
		// 섭씨->화씨
		if(1 == select)
		{
			System.out.println("섭씨를 입력해주세요.");
			
			// 섭씨 입력 받기
			degreeC = scanner.nextDouble();
			
			// 계산
			degreeF = (degreeC * 9/5) + 32;
		}
		// 화씨->섭씨
		else if(2 == select)
		{
			System.out.println("화씨를 입력해주세요.");
						
			// 화씨 입력 받기
			degreeF = scanner.nextDouble();
			
			// 계산
			degreeC = (degreeF - 32) * 5/9;	
		}
		else
		{
			System.out.println("잘못 입력하셨습니다.");		
			return;
		}		
			
		// 화씨 결과 출력
		System.out.println("화씨 = " + degreeF +"이고, 섭씨 = " + degreeC + "입니다.");
	}
	
	
	
	// 도넛의 면적 구하기
	private static void Area(Scanner scanner)
	{

		
				
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

