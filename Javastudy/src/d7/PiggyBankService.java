package d7;



// Service class
// 실제 저금통 역할
public class PiggyBankService {
	// 변수
	int balance;

	// 생성자
	public PiggyBankService() {
		this.balance = 0;
	}
	
	//=========================METHOD=============================//
	// 저금
	public void deposit(int money) {
		balance += money;
	}
	
	// 돈 찾고 비우기
	public int withdraw() {
		int result = balance;
		balance = 0;
		return result;
	}
}
