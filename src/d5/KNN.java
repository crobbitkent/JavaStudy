package d5;



public class KNN {
	public static void main(String[] args) {
		// ������ �迭
		final int[][] arr = {
				{6,4,1},
				{7,2,1},
				{5,2,1},
				{4,5,2},
				{3,4,2},
				{3,2,2}
		};
		
		int[] targetArr = {4,2};
		
		for(int i = 0; i < arr.length; ++i) {

			
			int[] temp = arr[i];
			
			double distance = KNN.calcDistance(temp, targetArr);
			
			System.out.println(distance);
		} // for i end
		
		
		
		
	} // main end
	
	
	// �� �� ���� �Ÿ� ���
	private static double calcDistance(int[] arr1, int[] arr2) {
		return Math.sqrt(Math.pow(arr1[0] - arr2[0], 2) + Math.pow(arr1[1] - arr2[1], 2));
	} // getDistance end
	
	
	
}
