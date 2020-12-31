package d2;

import java.util.Scanner;

// ���������� ����
public class RSPGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int winStreakCom = 0;  // ��ǻ�� ����
		int winStreakUser = 0; // ����� ����
		int winCondition = 3; // ������ ��� �ϸ� �̱�°�?

		while (true) {
			System.out.println("������ 0, ������ 1, ���� 2");
			
			// ���
			// ��ǻ���� ��(0~2)
			int com = (int) (Math.random() * 3);
			// ������� ��(0~2)
			int user = scanner.nextInt();
			// ����
			int gap = com - user;

			if (0 > gap) {
				gap += 3;
			}

			String result = "";

			// gap�� 1�̸� lose
			// 2�� win
			// 0�̸� ���
			switch (gap) {
			case 0:
				result = "�����ϴ�.";
				break;
			case 1:
				result = "����� �����ϴ�...";
				++winStreakCom;
				winStreakUser = 0;
				
				if(winCondition <= winStreakCom){
					System.out.println("��ǻ�� ����߽��ϴ�.");
					return;
				}
				break;
			case 2:
				result = "����� �̰���ϴ�.";
				++winStreakUser;
				winStreakCom = 0;
				
				if(winCondition <= winStreakUser){
					System.out.println("�����մϴ�. ����� ����߽��ϴ�.");
					return;
				}
				break;
			default:
				System.out.println("������ �߻��߽��ϴ�.");
				return;
			} // end switch
			
			// ���� ����
			System.out.println(result + " com = " + com + ", user = " + user);
			System.out.println("com ���� = " + winStreakCom + ", user ���� = " + winStreakUser);
		} // end while
		
	}

}
