package org.bmi.service;

// Data Transfer Object
public class BMIUser {
	String name;
	double height;
	double weight;
	
	public BMIUser(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "BMIUser [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
}
