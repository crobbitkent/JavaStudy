package d11;



// 21/01/06 static 공부
public class Kiosk {
	private static int num;
	
	// 대기표 번호가 반환된다.
	public int pressButton() {
		return ++num;
	}
}
