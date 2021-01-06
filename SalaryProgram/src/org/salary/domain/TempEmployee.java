package org.salary.domain;

public class TempEmployee extends Employee {
	private int hireYear;
	
	public TempEmployee(
			String empNumber, String name, int payment, int hireYear) {
		super(empNumber, name, payment);
		// TODO Auto-generated constructor stub
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthlyPay() {
		// TODO Auto-generated method stub
		return payment/(double)12;
	}

	@Override
	public String[] getAllInfo() {
String[] result = new String[4];
		
		int i = 0;
		result[i++] = "��� : " + empNumber;
		result[i++] = "�̸� : " + name;
		result[i++] = "�⺻ �޿� : " + payment;
		result[i++] = "���� : " + hireYear;
		
		return result;
	}

	
	
}
