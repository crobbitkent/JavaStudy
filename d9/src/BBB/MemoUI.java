package BBB;

import java.util.Scanner;

import lombok.AllArgsConstructor;




 // 모든 필드를 입력받는 생성자가 만들어진다.
@AllArgsConstructor
public class MemoUI {
	
	private Scanner scanner;
	private MemoService service;

//	public MemoUI(Scanner scanner, MemoService service) {
//		this.scanner = scanner;
//		this.service = service;
//	}
	
	public void play() {
		inputCount();
		pickMemo();
	}
	
	
	private void inputCount() {
		int count = Integer.parseInt(communication("총 몇 명?"));
		service.readyMemo(count);
	}
	
	private void pickMemo() {
		int a = 0;
		communication("준비 되셨나요?");
		
		// 걸림
		if(service.getNextMemo().getContent().equals("X")) {
			communication("걸렸습니다... 시마이");
			return;
		}
		
		communication("다행히 O네요?");
		// 재귀
		pickMemo();
					
	}
	
	
	
	
	// 출력하고 입력받기
	private String communication(String out) {
		System.out.println(out);
		return scanner.nextLine();
	}
}
