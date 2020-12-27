package d4;




public class ArrayTest {
	public static void main(String[] args) {
		double[] data = {38,38,35,34,41,36,35,33,37,40};
		
		// 1. 루프를 돌아서 내용물 출력
		int length = data.length;
		
		for(int i = 0; i < length; ++i){
			System.out.println(data[i] + " ");
		}
			
		// 2. 전체의 합과 평균
		int sum = 0;
		
		for(int i = 0; i < length; ++i){
			sum += data[i];		
		}
		
		double average = sum / length;
		System.out.println("전체 합 = " + sum + ", 평균 값 = " + average);
		
		// 3. 제일 높은 수와 인덱스 번호 구하기
		double max = data[0];
		int maxIndex = 0;
		
		for(int i = 0; i < length - 1; ++i){
			double temp = data[i + 1];
			
			if(max < temp) {
				max = temp;
				maxIndex = i+1;
			}		
		}
		System.out.println("가장 높은 온도 = " + max + ", 인덱스 = " + maxIndex);
	}
}
