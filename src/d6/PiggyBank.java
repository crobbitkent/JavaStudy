package d6;




public class PiggyBank {
	int total = 0;

	public PiggyBank() {
	}
	
	// method
	// 저금
	public void deposit(int money) {
		total += money;
	}
	
	// 돈 찾고 비우기
	public int withdraw() {
		int temp = total;
		total = 0;
		return temp;
	}
	
	
}
