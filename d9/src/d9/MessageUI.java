package d9;

import java.util.Scanner;

// controller class
public class MessageUI {
	
	//======================= FIELD ===========================//
	Scanner scanner;
	MailSender sender;
	

	//======================= CONTRUCTOR =======================//
	public MessageUI(Scanner scanner, MailSender sender) {
		this.scanner = scanner;
		this.sender = sender;
	}
	
	
	//======================= METHOD =======================//
	public void update() {
		
		
		String to = communication("보낼 사람 :");
		String title = communication("메일 제목 :");
		String content = communication("메일 내용 :");
		
		MessageDTO dto = new MessageDTO(to, title, content);
		
		// DTO 결과 출력
		System.out.println(dto);
		
		String isCanceled = communication("전송을 보내려면 y, 취소하려면 n");
		
		if ("n".equalsIgnoreCase(isCanceled)) {
			// 재귀
			update();
			return;
		}

		// 보내기
		boolean result = sender.sendMail(dto);
		// 전송 결과 출력
		System.out.println("전송결과 : " + result);
	}
	
	// 출력하고 입력받기
	private String communication(String out) {
		System.out.println(out);
		return scanner.nextLine();
	}
}
