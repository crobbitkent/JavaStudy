package d7;

import java.util.Scanner;

// ����
public class PiggyBankUI {
	// ���, field, ����
	// Ÿ�� �����̸�
	Scanner scanner;
	
	// ������/������
	PiggyBankService service;

	// ������ (= ���� �غ�)
	public PiggyBankUI() {
		this.scanner = new Scanner(System.in);
		this.service = new PiggyBankService();
	}

	// �Ա��ΰ� ����ΰ�?
	public void init() {

		while (true) {
			System.out.println("�Ա��� 1��, ����� 2���Դϴ�.");
			int oper = Integer.parseInt(scanner.nextLine());

			if (1 == oper) {
				this.deposit();
			} else if (2 == oper) {
				confirmWithdraw();
			}
			else {
				return; 
			}
			
		} // end while
	}

	// �Ա��ϸ� "�ݾ��� ���ض�." = �Է�
	private void deposit() {
		System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
		int money = Integer.parseInt(scanner.nextLine());
		// PiggyBankService
		service.deposit(money);
		System.out.println("���� �ܾ��� " + service.balance + " �� �Դϴ�.");
	}

	// ����ϸ� "������ ����Ͻðڽ��ϱ�?" = Ȯ��
	private void confirmWithdraw() {
		System.out.println("������ ����Ͻðڽ��ϱ�? (Y or N)");
		String answer = scanner.nextLine();
		
		if (true == answer.equals("Y")) {
			System.out.println("��� �ݾ��� " + service.withdraw() + " ���Դϴ�.");
			System.out.println("���� �ܾ��� " + service.balance + " �� �Դϴ�.");
		}
	}

}
