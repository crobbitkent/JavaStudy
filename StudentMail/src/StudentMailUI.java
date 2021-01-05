import java.io.File;
import java.util.Scanner;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class StudentMailUI {
	private StudentMailService service;
	private Scanner scanner;
	
	public void send(File file) throws Exception {
		String id = communication("LOGIN ID :");
		String pw = communication("LOGIN PW :");
		final MailConfig config = new MailConfig(id, pw);
		
		String title = communication("�̸��� ���� :");
		String contents = communication("�̸��� ���� :");
		
		service.ready(config);
		service.sendAll(file, title, contents);
		// service.sendAll(file, "�̸��� �׽�Ʈ", "�����ؼ� �˼��մϴ�.");
	}
	
	
	
	// ����ϰ� �Է¹ޱ�
	private String communication(String out) {
		System.out.println(out);
		return scanner.nextLine();
	}
}
