import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import org.word.domain.ExcelReader;
import org.word.domain.WordDAO;
import org.word.service.WordProvider;
import org.word.ui.WordExamUI;

public class Main {
	
	
	

	public static void main(String[] args) {
		
		try {
			loadTest();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void word() {
		System.out.println("���α׷� ����");
		
		
		Scanner scanner = new Scanner(System.in);
		WordProvider pro = new WordProvider(); 
		
		WordExamUI ui = new WordExamUI(scanner, pro);
		
		ui.exam();
		
		
		System.out.println("���α׷� ����");
	}
	
	private static void test1() {
		// TEST
		// ExcelReader reader = new ExcelReader("C:\\testDB\\QuizList.xlsx");
		WordDAO dao = new WordDAO("C:\\testDB\\QuizList.xlsx");
		dao.ready();
		for(int i = 0; i < dao.getTotalQuizNumber(); ++i) {
			
			System.out.println(dao.getWord(i));
		}
	}
	
	private static void splitTest() {
		// �� ���ڿ��� �����
		String str = "��ǥ�� ����� ����� �ϴ°�?=vote";
		String[] result = str.split("=");
		
		System.out.println(Arrays.toString(result));
		
	}
	
	private static void loadTest() throws FileNotFoundException {
		File file = new File("C:\\testDB\\QuizList.txt");
		Scanner scanner = new Scanner(file, "UTF-8");
		
		String[] array;
		
		for(int i = 0; i < 4; ++i) {
			String line = scanner.nextLine();
			System.out.println(line);
			
			String[] result = line.split("=");
			
			System.out.println(Arrays.toString(result));
		}
	}
}
