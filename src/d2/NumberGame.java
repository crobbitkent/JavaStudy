package d2;

import java.util.Scanner;

public class NumberGame 
{
	public static void main(String[] args) 
	{
		// ���� ����
		int maxNumber = 100;

		// ������� �������
		int count = 0;
		
		// 1~100 ���ڸ� �Է�
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �ִ밪�� �Է����ּ���.");
		maxNumber = scanner.nextInt();
		System.out.println("1���� " + maxNumber + "���� ���ڸ� �����ϼ���.");
		System.out.println("�غ�Ǿ����� ENTER�� �����ּ���.");
		scanner.nextLine();

		// ���
		// �ּҰ� = 1
		int min = 1;
		// �ִ밪 = 100
		int max = maxNumber;
		// �Է��� ���� Scanner

		// ����
		// �߰����� ����Ѵ� = (�ּҰ� + �ִ밪) / 2;
		outer:while (true) // => labeled loop
		{
			++count;
			int guessNumber = (min + max) / 2;

			// �߰����� ���
			System.out.println(guessNumber + "�� �½��ϱ�?");
			System.out.println("�� ���ں��� ���ٸ� H, �´ٸ� C, ���ٸ� L�� �Է����ּ���.");

			// ����ڿ��� �Է¹ޱ�
			// userAnswer
			// String userAnswer = scanner.nextLine();

			// ����ġ��(userAnswer)

			// case "H":
			// �ּҰ��� �߰���+1�� �ȴ�.
			// �߰��� ���... �ݺ��ȴ�. 8���ٷ�
			switch (scanner.nextLine())
			{
			case "H":
			case "h":
				min = guessNumber + 1;
				break;
			case "C":
			case "c":
				System.out.println("�½��ϴ�. " + count + " ������ ������ϴ�.");
				// return;
				break outer;
			case "L":
			case "l":
				max = guessNumber - 1;
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				--count;
				break;
			} // end switch
			
		} // end while
		System.out.println("=============== ���α׷��� ����Ǿ����ϴ� ===================");
		
	} // end main

} // end class
