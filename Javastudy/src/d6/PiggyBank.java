package d6;




public class PiggyBank {
	int total = 0;

	public PiggyBank() {
	}
	
	// method
	// ����
	public void deposit(int money) {
		total += money;
	}
	
	// �� ã�� ����
	public int withdraw() {
		int temp = total;
		total = 0;
		return temp;
	}
	
	
}
