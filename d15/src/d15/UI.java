package d15;

import java.util.Scanner;

public class UI {

	Box box;
	Scanner scanner;

	public UI(Scanner scanner) {
		this.scanner = scanner;
	}

	public void start() {
		System.out.println("사람 수를 입력하세요");
		int select = Integer.parseInt(scanner.nextLine());
		box = new Box(select); // new 하면 클래스 이름 => box ㄴㄴ Box

		while (true) {
			System.out.println("준비가 되면 enter"); // 반복하고 싶은 곳 while
			scanner.nextLine();
			Memo temp = box.getNextMemo();
			System.out.println("당신이 뽑은 것은" + temp.getContents());

			if (temp.getContents() == "O") {
				System.out.println("당신이 아니네요");
			} else {
				System.out.println("당신이 걸렸습니다.");
				break;
			}
		}
	}

}
