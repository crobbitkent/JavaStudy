package d11;

public class Main {

	public static void main(String[] args) {
		ex1Main();
	}
	
	private static void ex1Main() {
		Ex1 obj1 = new Ex1();
		Ex1 obj2 = new Ex1();
	}
	
	private static void kioskMain() {
		Kiosk kiosk1 = new Kiosk();
		Kiosk kiosk2 = new Kiosk();
		int num1 = kiosk1.pressButton();
		int num2 = kiosk2.pressButton();
		
		System.out.println(num1 + ", " + num2);
	}
	
	
	
}
