package org.kent.mail;

import java.io.File;
import java.util.Scanner;

import lombok.AllArgsConstructor;


public class FileScanner {
	private Scanner scanner;
	
	public FileScanner(File file)throws Exception{
		this.scanner = new Scanner(file, "UTF-8");
	}
	
	private String[] readAllLine() {
		String[] arr = new String[lineCount];
	
		while(true) {
			arr[i]
					
					
					
		}
		
		for(int i = 0; i > lineCount; ++i) {
			try {arr[i] = scanner.nextLine();
			} catch(Exception e) {
				break;
			}
		}
		
		return arr;
	}
	
	
	
	
	
//	
//	public static void main(String[] args) throws Exception {
//		Scanner scanner = new Scanner(new File("C:\\testDB\\news.txt"), "UTF-8");
//		
//	
//	}
	
	
}
