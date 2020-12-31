package d2;

import java.util.Scanner;

// 가위바위보 게임
public class RSPGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int winStreakCom = 0;  // 컴퓨터 연승
		int winStreakUser = 0; // 사용자 연승
		int winCondition = 3; // 연승을 몇번 하면 이기는가?

		while (true) {
			System.out.println("가위는 0, 바위는 1, 보는 2");
			
			// 재료
			// 컴퓨터의 수(0~2)
			int com = (int) (Math.random() * 3);
			// 사용자의 수(0~2)
			int user = scanner.nextInt();
			// 로직
			int gap = com - user;

			if (0 > gap) {
				gap += 3;
			}

			String result = "";

			// gap이 1이면 lose
			// 2면 win
			// 0이면 비김
			switch (gap) {
			case 0:
				result = "비겼습니다.";
				break;
			case 1:
				result = "당신이 졌습니다...";
				++winStreakCom;
				winStreakUser = 0;
				
				if(winCondition <= winStreakCom){
					System.out.println("컴퓨가 우승했습니다.");
					return;
				}
				break;
			case 2:
				result = "당신이 이겼습니다.";
				++winStreakUser;
				winStreakCom = 0;
				
				if(winCondition <= winStreakUser){
					System.out.println("축하합니다. 당신이 우승했습니다.");
					return;
				}
				break;
			default:
				System.out.println("오류가 발생했습니다.");
				return;
			} // end switch
			
			// 연승 로직
			System.out.println(result + " com = " + com + ", user = " + user);
			System.out.println("com 연승 = " + winStreakCom + ", user 연승 = " + winStreakUser);
		} // end while
		
	}

}
