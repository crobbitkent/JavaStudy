package org.salary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public abstract class Employee {
	protected String empNumber;
	protected String name;
	protected int payment;
	
	public abstract double getMonthlyPay(); 
	
	public abstract String[] getAllInfo();
}
