package org.salary.domain;

import java.util.Properties;

public class PartTimeEmployee extends Employee {
	private int workDay;
	
	public PartTimeEmployee(
			String empNumber, String name, int payment, int workDay) {
		super(empNumber, name, payment);
		// TODO Auto-generated constructor stub
		this.workDay = workDay;
	}

	@Override
	public double getMonthlyPay() {
		// TODO Auto-generated method stub
		return payment * workDay;
	}

	@Override
	public String[] getAllInfo() {
		// TODO Auto-generated method stub
		String[] result = new String[4];
		
		int i = 0;
		result[i++] = "��� : " + empNumber;
		result[i++] = "�̸� : " + name;
		result[i++] = "�⺻ �޿� : " + payment;
		result[i++] = "��� �ϼ� : " + workDay;
		
		return result;
	}
	
	

}
