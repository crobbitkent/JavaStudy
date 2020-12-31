package org.bmi.ui;

import java.util.Scanner;

import org.bmi.service.BMIService;
import org.bmi.service.BMIUser;

public class BMIUI {
	
	//=========================FIELD========================//
	Scanner scanner;
	BMIUser user;
	BMIService service;
	
	
	//=========================CONSTRUCTOR========================//
	public BMIUI(BMIService service) {
		super();
		this.scanner = new Scanner(System.in);
		this.service = service;
	}
	
	
	//=========================METHOD========================//
	public void input() {
		String name = printAndAnswer("������ �̸��� ��������.");
		
		double height = Double.parseDouble(
				printAndAnswer("Ű(cm)�� �Է��ϼ���."));
		
		double weight = Double.parseDouble(
				printAndAnswer("������(kg)�� �Է��ϼ���."));
		
		user = new BMIUser(name, height, weight);
		
		System.out.println(user);
		
		// bmi ���
		double bmi = service.calculate(user);
		
		System.out.println(bmi);
	}
	
	// message�� ����ϰ� ����ڿ��� �Է� �޴´�.
	private String printAndAnswer(String msg) {
		System.out.println(msg);
		return scanner.nextLine();
	}	
}
