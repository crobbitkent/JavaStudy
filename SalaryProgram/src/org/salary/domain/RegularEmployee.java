package org.salary.domain;


public class RegularEmployee extends Employee {
	private int bonus;
	
	
	public RegularEmployee(
			String empNumber, String name, int payment, int bonus) {
		super(empNumber, name, payment);
		// TODO Auto-generated constructor stub
		this.bonus = bonus;
	}

	@Override
	public double getMonthlyPay() {
		// TODO Auto-generated method stub
		return ((payment + bonus)/(double)12);
	}

	@Override
	public String toString() {
		
		return super.toString() + "bonus = " + bonus;
	}

	@Override
	public String[] getAllInfo() {
		String[] result = new String[4];
		
		int i = 0;
		result[i++] = "��� : " + empNumber;
		result[i++] = "�̸� : " + name;
		result[i++] = "�⺻ �޿� : " + payment;
		result[i++] = "���ʽ� : " + bonus;
		
		return result;
	}
	
}
