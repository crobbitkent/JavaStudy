package org.kent.mail;

import java.util.Scanner;



// application 
public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("=================== 프로그램 시작 =======================");
		MessageUI ui = new MessageUI(new Scanner(System.in));
		ui.update();
		System.out.println("=================== 프로그램 종료 =======================");
		
	}
}
