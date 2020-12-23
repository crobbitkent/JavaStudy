package d2;

import java.util.Scanner;

public class NumberGame 
{
	public static void main(String[] args) 
	{
		// 범위 설정
		int maxNumber = 100;

		// 몇번만에 맞췄는지
		int count = 0;
		
		// 1~100 숫자를 입력
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 최대값을 입력해주세요.");
		maxNumber = scanner.nextInt();
		System.out.println("1부터 " + maxNumber + "까지 숫자를 생각하세요.");
		System.out.println("준비되었으면 ENTER를 눌러주세요.");
		scanner.nextLine();

		// 재료
		// 최소값 = 1
		int min = 1;
		// 최대값 = 100
		int max = maxNumber;
		// 입력을 위한 Scanner

		// 로직
		// 중간값을 계산한다 = (최소값 + 최대값) / 2;
		outer:while (true) // => labeled loop
		{
			++count;
			int guessNumber = (min + max) / 2;

			// 중간값을 출력
			System.out.println(guessNumber + "이 맞습니까?");
			System.out.println("이 숫자보다 높다면 H, 맞다면 C, 낮다면 L를 입력해주세요.");

			// 사용자에게 입력받기
			// userAnswer
			// String userAnswer = scanner.nextLine();

			// 스위치문(userAnswer)

			// case "H":
			// 최소값이 중간값+1이 된다.
			// 중간값 계산... 반복된다. 8번줄로
			switch (scanner.nextLine())
			{
			case "H":
			case "h":
				min = guessNumber + 1;
				break;
			case "C":
			case "c":
				System.out.println("맞습니다. " + count + " 번만에 맞췄습니다.");
				// return;
				break outer;
			case "L":
			case "l":
				max = guessNumber - 1;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				--count;
				break;
			} // end switch
			
		} // end while
		System.out.println("=============== 프로그램이 종료되었습니다 ===================");
		
	} // end main

} // end class
