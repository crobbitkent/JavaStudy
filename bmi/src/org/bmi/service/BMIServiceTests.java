package org.bmi.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BMIServiceTests {
	int count = 0;
	
	static BMIService service;
	
	// Test가 실행되기 최초에 실행된다.
	@BeforeAll
	static void setup() {
		service = new BMIService();
		System.out.println("setup");
	}
	
	// Test가 실행되기 전에 항상 실행된다.
	@BeforeEach
	void beforeEach() {
		System.out.println("before each" + ++count);
	}
	
	@Test
	void nullTest() {
		// 두 인자가 같은지 확인하는 함수
		assertNotNull(service);
	}

	@Test
	void calcValueTest() {
		// 두 인자가 같은지 확인하는 함수
		double bmi = service.calculate(1.8, 60);
		
		System.out.println(bmi);
		assertEquals(bmi, 18.51);
	}
}
