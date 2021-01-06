import java.util.Scanner;

import org.salary.domain.Employee;
import org.salary.repository.EmployeeDAO;
import org.salary.service.SalaryService;
import org.salary.ui.SalaryUI;
import org.salary.util.ExcelReader;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ExcelReader reader = new ExcelReader("C:\\testDB\\SalaryData.xlsx");
		
		EmployeeDAO dao = new EmployeeDAO(reader);
		
		SalaryService service = new SalaryService(dao);
		SalaryUI ui = new SalaryUI(service, scanner);
		ui.init();
	}
}



