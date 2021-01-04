import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		
		System.out.println("프로그램 시작");
		
		Scanner scanner = new Scanner(System.in);
		
		File file = new File("C:\\testDB\\emailList.txt");
		StudentMailService service = new StudentMailService();
		
		// 파일과 서비스를 의존성 주입
		StudentMailUI ui = new StudentMailUI(service, scanner);
		ui.send(file);
		
		System.out.println("프로그램 종료");
	}
}
