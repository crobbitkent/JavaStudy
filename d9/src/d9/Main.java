package d9;

import java.util.Scanner;



// application 
public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("=================== ���α׷� ���� =======================");
		MessageUI ui = new MessageUI(new Scanner(System.in), new MailSender());
		ui.update();
		System.out.println("=================== ���α׷� ���� =======================");
		
	}
}
