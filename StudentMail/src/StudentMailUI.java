import java.io.File;
import java.util.Properties;
import java.util.Scanner;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StudentMailUI {
	private StudentMailService service;
	private Scanner scanner;

	public void send(File file) throws Exception {
		String id = communication("LOGIN ID :");
		String pw = communication("LOGIN PW :");

		Properties prop = new Properties();

		prop.setProperty("id", id);
		prop.setProperty("pw", pw);

		final MailConfig config = new MailConfig(prop);

		while (true) {
			System.out.println("프로그램을 종료하시려면 x를 입력하세요.");
			String title = communication("이메일 제목 :");
			String contents = communication("이메일 내용 :");

			if(true == title.equals("x") || true == title.equals("X")) {
				break;
			}
			
			service.ready(config);
			service.sendAll(file, title, contents);
			// service.sendAll(file, "이메일 테스트", "방해해서 죄송합니다.");

		} // while end
	}

	// 출력하고 입력받기
	private String communication(String out) {
		System.out.println(out);
		return scanner.nextLine();
	}
}
