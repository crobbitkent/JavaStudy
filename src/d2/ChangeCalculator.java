package d2;

import java.util.Scanner;

// 12/23
// if�� ����
public class ChangeCalculator 
{
	public static void main(String[] args)
	{
		// �ܵ� ����ϱ�
		
		// �Է� = ��
		Scanner scanner = new Scanner(System.in);
		
		// ��� = 500�� 100�� 10��
		System.out.println("�Ž������� �Է��ϼ���.");
		
		// ������
		int change = (scanner.nextInt() / 10) * 10;
		int fiveHundred = 0;
		int oneHundred = 0;
		int ten = 0;
		System.out.println("����� �Ž����� = " + change);
		
		// ����
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
			// change -= ten * 10; // ���� ����� �ʿ����.
		}
		
		

		System.out.println("500�� = " + fiveHundred + "��, 100�� = " + oneHundred + "��, 10�� = " + ten + "��");
	}
}