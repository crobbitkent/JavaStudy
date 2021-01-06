package d11;







public class Ex1 {
	
	static {
		System.out.println("EX1");
	}
	
	// 이렇게 하면 생성(new) 불가
	// java doc에도 나오지 않는다.
	// 함수들만 묶어놓은 유틸리티 클래스에 이렇게 사용된다.
	// private Ex1() {	}
	
	public void doA() {
		System.out.println("A");
		Ex1.doB();
	}
	
	public static void doB() {
		System.out.println("B");
		// doA(); // 불가능
	}
	
	
	
	
}