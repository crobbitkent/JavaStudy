package d7;

public class PiggyBankMain {
	
	public static void main(String[] args) {
		System.out.println("====================���α׷��� ���۵Ǿ����ϴ�.=====================");
		
		PiggyBankUI uiA = new PiggyBankUI();		
		uiA.init();
		PiggyBankService ser = new PiggyBankService();
		uiA.service = ser; // ������ ����
		
		System.out.println("====================���α׷��� ����Ǿ����ϴ�.=====================");
	}
	
}
