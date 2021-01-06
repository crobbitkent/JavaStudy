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
		String select = communication("1: ��ü ���� ��ȸ, 2: ���� ��ȸ, 3: ����");
		
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
		
		// ���
		init();
	}
	
	// ��� ���� ���� ���
	private void showAll() {
		int count = service.getTotalEmpCount();
		for(int i = 0; i < count; ++i) {
			showEmployee(service.getEmployee(i));
		}
	}
	
	// ������ ���� �����ֱ�
	private void showPayment() {
		String select = communication("���ϴ� ������ ����� �Է��ϼ���.");
		int num = Integer.parseInt(select) - 1;
		Employee emp = service.getEmployee(num);
		show("���� �̸� : " + emp.getName());
		show("���� : " + emp.getMonthlyPay());
	}
	
	// ���� ���� �����ֱ�
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
