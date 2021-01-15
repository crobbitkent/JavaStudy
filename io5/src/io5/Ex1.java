package io5;

import java.net.URL;
import java.util.Scanner;

public class Ex1 {

	
	public static void main(String[] args) throws Exception {
		
		Scanner keyScanner = new Scanner(System.in);
		
		System.out.println("Enter");
		
		keyScanner.nextLine();
		
		String path = "www.naver.com";	
		
		for(int i = 0; i < 10000; ++i) {
			
			new Thread(()-> {
				try {
					// url 
					URL url = new URL(path);
	
	
					System.out.println(url);

				} catch(Exception e) {
					
				}
			}).start();
			


			
		} // end i for
		
		System.out.println("over");
		
	}
	
	
}
