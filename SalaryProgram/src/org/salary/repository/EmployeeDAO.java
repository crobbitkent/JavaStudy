package org.salary.repository;

import org.salary.domain.Employee;
import org.salary.domain.PartTimeEmployee;
import org.salary.domain.RegularEmployee;
import org.salary.domain.TempEmployee;
import org.salary.util.ExcelReader;

import lombok.Getter;

public class EmployeeDAO {
	private Employee[] employees;
	private ExcelReader reader;
	@Getter
	private int totalCount;

	
	public EmployeeDAO(ExcelReader reader) {
		this.reader = reader;
		ready();
	}
	
	public Employee getEmployee(int index) {
		return (index >= totalCount) ? null : employees[index];
	}

	private void ready() {
		totalCount = reader.getLastRowNum();
		employees = new Employee[totalCount];
		
		for(int i = 0; i < totalCount; ++i) {
			int j = 0;
			String no = reader.getCellString(i, j++);
			String name = reader.getCellString(i, j++);
			String type = reader.getCellString(i, j++);
			
			int pay = reader.getCellInt(i, j++);
			int extra = reader.getCellInt(i, j++);
			
			// 회원유형	회원이름	연봉/일당	일한날짜/연차
			switch(type) {
			case "R":
				employees[i] = new RegularEmployee(no, name, pay, extra);
				break;
			case "T":
				employees[i] = new TempEmployee(no, name, pay, extra);
				break;
			case "A":
				employees[i] = new PartTimeEmployee(no, name, pay, extra);
				break;
			default:
				break;
			} // switch end
			
			System.out.println(employees[i]);
		}// for end
	}
	
}
