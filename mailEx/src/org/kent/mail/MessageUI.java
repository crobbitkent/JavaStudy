package org.kent.mail;

import java.util.Scanner;

// controller class
public class MessageUI {
	
	//======================= FIELD ===========================//
	Scanner scanner;
	MailSender sender;
	

	//======================= CONTRUCTOR =======================//
	public MessageUI(Scanner scanner) {
		this.scanner = scanner;
	}
	
	
	//======================= METHOD =======================//
	public void update() {
		String loginID = communication("LOGIN ID :");
		String loginPassword = communication("LOGIN PASSWORD :");
		
		// �α� ��
		final MailConfig config = new MailConfig(loginID, loginPassword);
		sender = new MailSender(config);
		
		// ���� �ۼ�
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
