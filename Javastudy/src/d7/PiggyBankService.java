package d7;



// Service class
// ���� ������ ����
public class PiggyBankService {
	// ����
	int balance;

	// ������
	public PiggyBankService() {
		this.balance = 0;
	}
	
	//=========================METHOD=============================//
	// ����
	public void deposit(int money) {
		balance += money;
	}
	
	// �� ã�� ����
	public int withdraw() {
		int result = balance;
		balance = 0;
		return result;
	}
}
