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
		result[i++] = "사번 : " + empNumber;
		result[i++] = "이름 : " + name;
		result[i++] = "기본 급여 : " + payment;
		result[i++] = "보너스 : " + bonus;
		
		return result;
	}
	
}
