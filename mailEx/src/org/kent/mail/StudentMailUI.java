package org.kent.mail;

import java.io.File;

import lombok.AllArgsConstructor;


public class StudentMailUI {
	private FileScanner fileScanner;
	private MailSender sender;
	private int studentCount;

	
	
	
	
	public StudentMailUI(MailSender sender, int studentCount, File file) throws Exception{
		super();
		this.sender = sender;
		this.studentCount = studentCount;
		fileScanner = new FileScanner(file);
	}



	private boolean sendToAllStudents() {
		boolean result = false;

		// MailSender�� ������
		
		
		return result;
	}
	
	
	
	
	
	
	
	// ����ϰ� �Է¹ޱ�
	private String communication(String out) {
		System.out.println(out);
		return scanner.nextLine();
	}
}
