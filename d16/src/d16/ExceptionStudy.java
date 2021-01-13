package d16;

public class ExceptionStudy {

	public static void main(String[] args) {

		for (int i = -10; i < 10; ++i) {
			// Run-time Exception
			// ArithmeticException / by zero
			int result = doA(10, i);

			System.out.println(result);
		}
	
	}

	private static int doA(int num1, int num2) {
		int result = 0;
		try {
			result = num1 / num2;
		} catch(Exception e) {
			result = 0;
		}
		
		return result;
	}
	
}
