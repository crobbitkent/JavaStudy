package org.bmi.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BMIServiceTests {
	int count = 0;
	
	static BMIService service;
	
	// Test�� ����Ǳ� ���ʿ� ����ȴ�.
	@BeforeAll
	static void setup() {
		service = new BMIService();
		System.out.println("setup");
	}
	
	// Test�� ����Ǳ� ���� �׻� ����ȴ�.
	@BeforeEach
	void beforeEach() {
		System.out.println("before each" + ++count);
	}
	
	@Test
	void nullTest() {
		// �� ���ڰ� ������ Ȯ���ϴ� �Լ�
		assertNotNull(service);
	}

	@Test
	void calcValueTest() {
		// �� ���ڰ� ������ Ȯ���ϴ� �Լ�
		double bmi = service.calculate(1.8, 60);
		
		System.out.println(bmi);
		assertEquals(bmi, 18.51);
	}
}
