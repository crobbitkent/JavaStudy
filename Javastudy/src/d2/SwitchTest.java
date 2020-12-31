package d2;

public class SwitchTest 
{
	public static void main(String[] args)
	{
		// switch가 가능한 변수 타입 - int, char, String, enum
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
		
		System.out.println("당신의 성적은 " + gradeString);
	}
}
