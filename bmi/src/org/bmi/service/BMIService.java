package org.bmi.service;


// Logic Object
public class BMIService {
	
	
	
	// ù��°�� ���� ��
	public double calculate(BMIUser user) {
		double result = 0;
		
		// BMI ���
		result = calculate(user.height, user.weight);
		
		return result;
	}
	
	public double calculate(double height, double weight) {
		double result = weight / Math.pow(height * 0.01, 2);
		
		result = Math.floor(result * 100) / 100;
		
		return result;
	}
	
	
}
