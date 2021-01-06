package org.salary.repository;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.salary.util.ExcelReader;

public class EmployeeDAOTest {
	EmployeeDAO dao;
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		ExcelReader reader = new ExcelReader("C:\\testDB\\SalaryData.xlsx");
		dao = new EmployeeDAO(reader);
		
		fail("Not yet implemented");
	}

}
