package org.bmi.main;

import org.bmi.service.BMIService;
import org.bmi.ui.BMIUI;

// ���α׷� ����
public class BMIMain {
	
	
	public static void main(String args[]) {
		System.out.println("==================BMI ���α׷� ����===========================");
		
		BMIService service = new BMIService();
		
		// ������ ���� ��, ������ ����(DI)
		BMIUI ui = new BMIUI(service);
		ui.input();
		
		System.out.println("==================BMI ���α׷� ����===========================");
	}
	
	
}
