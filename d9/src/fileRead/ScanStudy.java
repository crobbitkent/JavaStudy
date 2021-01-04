package fileRead;

import java.io.File;
import java.util.Scanner;

public class ScanStudy {
	
	
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("C:\\testDB\\news.txt"), "UTF-8");
		
		while(true) {
			try {
				String str = scanner.nextLine();
				System.out.println(str);
			} catch (Exception e) {
				break;
			}
		}
	}
	
	
}
