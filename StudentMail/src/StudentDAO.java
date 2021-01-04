import java.io.File;
import java.util.Scanner;

import lombok.Getter;

@Getter
public class StudentDAO {
	private Student[] studentList;
	private FileScanner fileScanner;
	private int studentCount = 30;
	
	// ������ �л� ����Ʈ�� �����.
	public Student[] fileToList(File file) throws Exception {
		fileScanner = new FileScanner(file);
		
		String[] arr = fileScanner.readAllLine(studentCount * 2);
		
		int length = (int)(arr.length * 0.5);

		// �л� ����Ʈ�� ����
		studentList = new Student[length];
		
		for(int i = 0; i < length; ++i) {
			String name = arr[i * 2];
			String email = arr[i * 2 + 1];
			
			studentList[i] = new Student(name, email);
		}
		
		// �����
		for(int i = 0; i < length; ++i) {			
			System.out.println(studentList[i]);
		}
		
		return studentList;
	}
	
	
}
