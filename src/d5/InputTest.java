package d5;

import java.util.Scanner;

public class InputTest {
	// args = 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("���ڸ� �Է��ϼ���.");
		
		String str = scanner.nextLine();
		System.out.println(str);
		
		int value = Integer.parseInt(str);
		
		System.out.println(value);
		
		System.out.println(args);
	}
}
