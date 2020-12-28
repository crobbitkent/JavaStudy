package d5;

import java.util.Scanner;

// ���ο� ���������� ����
public class NewRPSGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int winStreak = 0;
		char beforeWin = 'A';

		while (true) {
			System.out.println("���� : 0, ���� : 1, �� : 2");
			int user = scanner.nextInt() % 3;
			int com = (int) (Math.random() * 3);
			String userString = NewRPSGame.rpsChecker(user);
			String comString = NewRPSGame.rpsChecker(com);

			System.out.println("�� = " + userString);
			System.out.println("�� = " + comString);

			int gap = user - com;

			if (0 > gap) {
				gap += 3;
			}

			String gameResult = "";

			switch (gap) {
			case 0:
				gameResult = "DRAW";
				break;
			// �� �̱�
			case 1:
				gameResult = "LOSE";

				if ('C' == beforeWin) {
					++winStreak;
				} else {
					winStreak = 1;
				}

				beforeWin = 'C';
				break;
			// ���� �̱�
			case 2:
				gameResult = "WIN";

				if ('U' == beforeWin) {
					++winStreak;
				} else {
					// ���� ����
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

	// ���ڸ� ������ => ������������ String����
	private static String rpsChecker(int rps) {
		String result = "";

		switch (rps) {
		case 0:
			result = "����";
			break;
		case 1:
			result = "����";
			break;
		case 2:
			result = "��";
			break;
		}

		return result;
	} // rpsChecker end

}
