package d5;

import java.util.Arrays;

public class LotteryGame {
	public static void main(String[] args) {
		// ���
		int count = 6;
		int maxNumber = 45;
		
		// ��� �迭
		int[] resultArray = new int[count];
		
		// ����
		for(int i = 0; i < count; ++i) {
			int value = (int)(Math.random() * maxNumber) + 1;
			
			// ��� �迭�� �ش� ���ڰ� �ִ��� Ȯ��
			boolean checkSameNumber = FunctionTest1.contains(resultArray, value);
			
			// ������ �ٽ� �̱�
			// ������ �迭�� ���
			if(true == checkSameNumber) {
				System.out.println("�ߺ� �߻� " + value);
				--i;
				continue;
			}
				
			resultArray[i] = value;
			
		} // for end
		
		System.out.println(Arrays.toString(resultArray));	
	}
	
	
}
