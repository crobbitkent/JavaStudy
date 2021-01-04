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
		
		
		String to = communication("���� ��� :");
		String title = communication("���� ���� :");
		String content = communication("���� ���� :");
		
		MessageDTO dto = new MessageDTO(to, title, content);
		
		// DTO ��� ���
		System.out.println(dto);
		
		String isCanceled = communication("������ �������� y, ����Ϸ��� n");
		
		if ("n".equalsIgnoreCase(isCanceled)) {
			// ���
			update();
			return;
		}

		// ������
		boolean result = sender.sendMail(dto);
		// ���� ��� ���
		System.out.println("���۰�� : " + result);
	}
	
	// ����ϰ� �Է¹ޱ�
	private String communication(String out) {
		System.out.println(out);
		return scanner.nextLine();
	}
}
