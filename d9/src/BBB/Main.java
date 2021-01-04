package BBB;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Scanner scanner = new Scanner(System.in);
		MemoService service = new MemoService();
		
		MemoUI ui = new MemoUI(scanner, service);
		
		ui.play();
		
		System.out.println("프로그램 종료");

	}
}
