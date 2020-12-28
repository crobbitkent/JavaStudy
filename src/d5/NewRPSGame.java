package d5;

import java.util.Scanner;

// 새로운 가위바위보 게임
public class NewRPSGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int winStreak = 0;
		char beforeWin = 'A';

		while (true) {
			System.out.println("가위 : 0, 바위 : 1, 보 : 2");
			int user = scanner.nextInt() % 3;
			int com = (int) (Math.random() * 3);
			String userString = NewRPSGame.rpsChecker(user);
			String comString = NewRPSGame.rpsChecker(com);

			System.out.println("나 = " + userString);
			System.out.println("컴 = " + comString);

			int gap = user - com;

			if (0 > gap) {
				gap += 3;
			}

			String gameResult = "";

			switch (gap) {
			case 0:
				gameResult = "DRAW";
				break;
			// 컴 이김
			case 1:
				gameResult = "LOSE";

				if ('C' == beforeWin) {
					++winStreak;
				} else {
					winStreak = 1;
				}

				beforeWin = 'C';
				break;
			// 유저 이김
			case 2:
				gameResult = "WIN";

				if ('U' == beforeWin) {
					++winStreak;
				} else {
					// 연승 리셋
					winStreak = 1;
				}

				beforeWin = 'U';
				break;
			}

			System.out.println(gameResult);

			if (3 == winStreak) {
				System.out.println("GAME OVER");
				return;

			}

		} // while end

	} // main end

	// 숫자를 넣으면 => 가위바위보의 String으로
	private static String rpsChecker(int rps) {
		String result = "";

		switch (rps) {
		case 0:
			result = "가위";
			break;
		case 1:
			result = "바위";
			break;
		case 2:
			result = "보";
			break;
		}

		return result;
	} // rpsChecker end

}
