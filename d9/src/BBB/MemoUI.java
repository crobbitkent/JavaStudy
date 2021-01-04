package BBB;

import java.util.Scanner;

import lombok.AllArgsConstructor;




 // ��� �ʵ带 �Է¹޴� �����ڰ� ���������.
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
		int count = Integer.parseInt(communication("�� �� ��?"));
		service.readyMemo(count);
	}
	
	private void pickMemo() {
		int a = 0;
		communication("�غ� �Ǽ̳���?");
		
		// �ɸ�
		if(service.getNextMemo().getContent().equals("X")) {
			communication("�ɷȽ��ϴ�... �ø���");
			return;
		}
		
		communication("������ O�׿�?");
		// ���
		pickMemo();
					
	}
	
	
	
	
	// ����ϰ� �Է¹ޱ�
	private String communication(String out) {
		System.out.println(out);
		return scanner.nextLine();
	}
}
