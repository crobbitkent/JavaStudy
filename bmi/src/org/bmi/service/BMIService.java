package org.bmi.service;


// Logic Object
public class BMIService {
	
	
	
	// 첫번째로 만든 것
	public double calculate(BMIUser user) {
		double result = 0;
		
		// BMI 계산
		result = calculate(user.height, user.weight);
		
		return result;
	}
	
	public double calculate(double height, double weight) {
		double result = weight / Math.pow(height * 0.01, 2);
		
		result = Math.floor(result * 100) / 100;
		
		return result;
	}
	
	
}
