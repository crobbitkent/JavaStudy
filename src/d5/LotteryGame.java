package d5;

import java.util.Arrays;

public class LotteryGame {
	public static void main(String[] args) {
		// 재료
		int count = 6;
		int maxNumber = 45;
		
		// 결과 배열
		int[] resultArray = new int[count];
		
		// 로직
		for(int i = 0; i < count; ++i) {
			int value = (int)(Math.random() * maxNumber) + 1;
			
			// 결과 배열에 해당 숫자가 있는지 확인
			boolean checkSameNumber = FunctionTest1.contains(resultArray, value);
			
			// 있으면 다시 뽑기
			// 없으면 배열에 담고
			if(true == checkSameNumber) {
				System.out.println("중복 발생 " + value);
				--i;
				continue;
			}
				
			resultArray[i] = value;
			
		} // for end
		
		System.out.println(Arrays.toString(resultArray));	
	}
	
	
}
