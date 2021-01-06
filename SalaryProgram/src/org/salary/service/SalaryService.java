package org.salary.service;

import org.salary.domain.Employee;
import org.salary.repository.EmployeeDAO;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SalaryService {
	@NonNull
	EmployeeDAO dao;
	
	public Employee getEmployee(int index) {
		return 	dao.getEmployee(index);
	}
	
	public int getTotalEmpCount() {
		return dao.getTotalCount();
	}
}
