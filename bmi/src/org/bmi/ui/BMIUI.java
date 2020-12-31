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
		String name = printAndAnswer("본인의 이름을 적으세요.");
		
		double height = Double.parseDouble(
				printAndAnswer("키(cm)를 입력하세요."));
		
		double weight = Double.parseDouble(
				printAndAnswer("몸무게(kg)를 입력하세요."));
		
		user = new BMIUser(name, height, weight);
		
		System.out.println(user);
		
		// bmi 계산
		double bmi = service.calculate(user);
		
		System.out.println(bmi);
	}
	
	// message를 출력하고 사용자에게 입력 받는다.
	private String printAndAnswer(String msg) {
		System.out.println(msg);
		return scanner.nextLine();
	}	
}
