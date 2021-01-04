

import java.io.File;
import java.util.Scanner;

import lombok.AllArgsConstructor;


public class FileScanner {
	private Scanner scanner;
	
	public FileScanner(File file) throws Exception {
		this.scanner = new Scanner(file, "UTF-8");
	}
	
	public String[] readAllLine(int lineCount) {
		String[] arr = new String[lineCount];

		int count = 0;
		
		for(int i = 0; i < lineCount; ++i) {
			try {
				arr[i] = scanner.nextLine();
				if(arr[i].isEmpty()) {
					break;
				}
				++count;
			} catch(Exception e) {
				break;
			}
		}
		
		String[] result = new String[count];
		
		System.arraycopy(arr, 0, result, 0, count);
		
		return result;
	}	
}
