package d7;

public class PiggyBankMain {
	
	public static void main(String[] args) {
		System.out.println("====================프로그램이 시작되었습니다.=====================");
		
		PiggyBankUI uiA = new PiggyBankUI();		
		uiA.init();
		PiggyBankService ser = new PiggyBankService();
		uiA.service = ser; // 의존성 주입
		
		System.out.println("====================프로그램이 종료되었습니다.=====================");
	}
	
}
