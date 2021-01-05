import java.io.File;
import java.util.Scanner;

import lombok.Getter;

@Getter
public class StudentDAO {
	private Student[] studentList;
	private Scanner scanner;
	
	private int studentCount = 30;
	
	public StudentDAO(File file)  throws Exception {
		fileToList(file);	
	}
	
	// 파일을 학생 리스트로 만든다.
	public Student[] fileToList(File file) throws Exception {
		scanner = new Scanner(file, "UTF-8");
		
		if (null == studentList) {
			readAllLine();
		}
		
		int length = studentList.length;
		
		// 디버깅용
		for(int i = 0; i < length; ++i) {			
			System.out.println(studentList[i]);
		}
		
		return studentList;
	}
	
	public void readAllLine() {
		String[] arr = new String[studentCount * 2];
		
		studentList = new Student[studentCount];
		
		int count = 0;
		
		for(int i = 0; i < studentCount * 2; i+=2) {
			
				arr[i] = scanner.nextLine();
				// System.out.println(arr[i]);
				if(arr[i].isEmpty()) {
					break;
				}
				
				arr[i+1] = scanner.nextLine();
				
				studentList[count++] = new Student(arr[i], arr[i+1]);			
		}
	
		Student[] result = new Student[count];
		
		for(int i = 0; i < count; ++i) {
			result[i] = studentList[i];
		}
			
		studentList = result;
	}	
	
	
	
}
