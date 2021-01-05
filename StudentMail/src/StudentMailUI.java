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
		
		String title = communication("이메일 제목 :");
		String contents = communication("이메일 내용 :");
		
		service.ready(config);
		service.sendAll(file, title, contents);
		// service.sendAll(file, "이메일 테스트", "방해해서 죄송합니다.");
	}
	
	
	
	// 출력하고 입력받기
	private String communication(String out) {
		System.out.println(out);
		return scanner.nextLine();
	}
}
