import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		
		System.out.println("���α׷� ����");
		
		Scanner scanner = new Scanner(System.in);
		
		File file = new File("C:\\testDB\\emailList.txt");
		StudentMailService service = new StudentMailService();
		
		// ���ϰ� ���񽺸� ������ ����
		StudentMailUI ui = new StudentMailUI(service, scanner);
		ui.send(file);
		
		System.out.println("���α׷� ����");
	}
}
