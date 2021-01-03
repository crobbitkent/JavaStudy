package d7;

import java.util.Scanner;

// 점원
public class PiggyBankUI {
	// 재료, field, 변수
	// 타입 변수이름
	Scanner scanner;
	
	// 조력자/의존성
	PiggyBankService service;

	// 생성자 (= 영업 준비)
	public PiggyBankUI() {
		this.scanner = new Scanner(System.in);
		this.service = new PiggyBankService();
	}

	// 입금인가 출금인가?
	public void init() {

		while (true) {
			System.out.println("입금은 1번, 출금은 2번입니다.");
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

	// 입금하면 "금액을 정해라." = 입력
	private void deposit() {
		System.out.println("입금할 금액을 입력하세요");
		int money = Integer.parseInt(scanner.nextLine());
		// PiggyBankService
		service.deposit(money);
		System.out.println("현재 잔액은 " + service.balance + " 원 입니다.");
	}

	// 출금하면 "정말로 출금하시겠습니까?" = 확인
	private void confirmWithdraw() {
		System.out.println("정말로 출금하시겠습니까? (Y or N)");
		String answer = scanner.nextLine();
		
		if (true == answer.equals("Y")) {
			System.out.println("출금 금액은 " + service.withdraw() + " 원입니다.");
			System.out.println("현재 잔액은 " + service.balance + " 원 입니다.");
		}
	}

}
