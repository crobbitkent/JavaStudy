package d5;

public class LotteryGame2 {
	
	public static void main(String[] args) {
		int ballCount = 45;
		int[] balls = new int[ballCount];

		for (int i = 0; i < ballCount; ++i) {
			balls[i] = i + 1;
		}
		
		
		
		for(int i = 0; i < 6; ++i) {
			// swap
			int ran = (int)(Math.random() * ballCount);
			int temp = balls[ran];
			balls[ran] = balls[ballCount - 1];
			balls[ballCount - 1] = temp;
			--ballCount;
		}
		
		for(int i = 0; i < 6; ++i)
		{
			System.out.println(balls[ballCount + i]);
		}
		
	}
}
