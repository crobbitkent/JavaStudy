package d2;

public class LeapYear {
	public static void main(String[] args) {
		// 자료
		int year = 2400;
		boolean isLeapYear = false;

		// 로직
		// 연도를 4로 나눈 값이 0이면 윤년
		if (0 == year % 4) {
			// 해당 연수가 100으로 나뉘어지면 평년
			if (0 == year % 100) {
				// 평년
				isLeapYear = false;
				
				// 평년이지만 400으로 나뉘어지면 윤년
				if (0 == year % 400) {
					// 윤년
					isLeapYear = true;
				}
			} else {
				isLeapYear = true;
			}
		}

		// 출력
		if (true == isLeapYear) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}	

		/*
		 * if(year % 400 == 0){ 
		 * 	 System.out.println(year + "윤년입니다."); 
		 * }else if(year % 100 == 0){
		 * 	 System.out.println(year + "평년입니다."); 
		 * }else if(year % 4 == 0){
		 *   System.out.println(year + "윤년입니다."); 
		 * }
		 */
	}
}
