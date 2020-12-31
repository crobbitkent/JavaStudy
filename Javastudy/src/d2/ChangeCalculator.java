package d2;

import java.util.Scanner;

// 12/23
// if문 공부
public class ChangeCalculator 
{
	public static void main(String[] args)
	{
		// 잔돈 계산하기
		
		// 입력 = 돈
		Scanner scanner = new Scanner(System.in);
		
		// 출력 = 500원 100원 10원
		System.out.println("거스름돈을 입력하세요.");
		
		// 데이터
		int change = (scanner.nextInt() / 10) * 10;
		int fiveHundred = 0;
		int oneHundred = 0;
		int ten = 0;
		System.out.println("계산할 거스름돈 = " + change);
		
		// 로직
		if(500 <= change)
		{
			fiveHundred = change / 500;
			change -= fiveHundred * 500;
		}
		
		if(100 <= change)
		{
			oneHundred = change / 100;
			change -= oneHundred * 100;
		}
		
		if(10 <= change)
		{
			ten = change / 10;
			// change -= ten * 10; // 굳이 계산할 필요없다.
		}
		
		

		System.out.println("500원 = " + fiveHundred + "개, 100원 = " + oneHundred + "개, 10원 = " + ten + "개");
	}
}