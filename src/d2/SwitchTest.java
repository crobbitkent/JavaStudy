package d2;

public class SwitchTest 
{
	public static void main(String[] args)
	{
		// switch�� ������ ���� Ÿ�� - int, char, String, enum
		char grade = 'D';
		String gradeString = "";
		int b = 0; 
		
		switch(b++)
		{
		case 0:
			int a = 0;
			gradeString = "A";
			break;

		case 1:
			gradeString = "B";
			break;

		case 2:
			gradeString = "C";
			break;
		default:
			gradeString = "F";
		}
		
		System.out.println("����� ������ " + gradeString);
	}
}
