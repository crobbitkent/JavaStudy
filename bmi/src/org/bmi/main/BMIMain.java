package org.bmi.main;

import org.bmi.service.BMIService;
import org.bmi.ui.BMIUI;

// 프로그램 시작
public class BMIMain {
	
	
	public static void main(String args[]) {
		System.out.println("==================BMI 프로그램 시작===========================");
		
		BMIService service = new BMIService();
		
		// 생성자 제한 후, 의존성 주입(DI)
		BMIUI ui = new BMIUI(service);
		ui.input();
		
		System.out.println("==================BMI 프로그램 종료===========================");
	}
	
	
}
