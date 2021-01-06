package org.salary.ui;

import java.util.Scanner;

import org.salary.domain.Employee;
import org.salary.service.SalaryService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SalaryUI {
	private SalaryService service;
	private Scanner scanner;
	
	public void init() {
		String select = communication("1: 전체 직원 조회, 2: 월급 조회, 3: 종료");
		
		switch(select) {
		case "1":
			showAll();
			break;
		case "2":
			showPayment();
			break;
		case "3":
			return;
		default:
			return;
		}
		
		// 재귀
		init();
	}
	
	// 모든 직원 정보 출력
	private void showAll() {
		int count = service.getTotalEmpCount();
		for(int i = 0; i < count; ++i) {
			showEmployee(service.getEmployee(i));
		}
	}
	
	// 직원의 월급 보여주기
	private void showPayment() {
		String select = communication("원하는 직원의 사번을 입력하세요.");
		int num = Integer.parseInt(select) - 1;
		Employee emp = service.getEmployee(num);
		show("직원 이름 : " + emp.getName());
		show("월급 : " + emp.getMonthlyPay());
	}
	
	// 직원 정보 보여주기
	private void showEmployee(Employee emp) {
		show("======================================");
		String[] info = emp.getAllInfo(); 
		int length = info.length;
		
		for(int i = 0; i < length; ++i) {
			show(info[i]);
		}
		show("======================================");
	}
	
	private String communication(String out) {
		System.out.println(out);
		return scanner.nextLine();
	}
	
	private void show(String str) {
		System.out.println(str);
	}
}
