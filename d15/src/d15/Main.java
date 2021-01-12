package d15;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 생성자 파라미터에 사용자가 선택한 숫자를 넣으면 그만큼 Memo가 든 Box가 생성된다.
//		
//		Box b1 = new Box(5);
//		
//		Memo[] temp = b1.getBox();
//		
//		for(int i =0; i<5; i++) {
//			System.out.println(temp[i].getContents());
//		}
//	
		Scanner scanner = new Scanner(System.in);
		UI ui = new UI(scanner);
		ui.start();
		
	}
}
