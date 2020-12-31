package d5;

import java.util.Arrays;
import java.util.Comparator;

public class KNN {
	public static void main(String[] args) {		
		// ������ �迭 1 = �׼�, 2 = ���
		final int[][] arr = {
				{6,4,1},
				{7,2,1},
				{5,2,1},
				{4,5,2},
				{3,4,2},
				{3,2,2}
		};
		
		// ��ǥ ��
		int[] targetArr = {4,2};
		
		// �Ÿ�(0)�� �ε���(1)�� �����ϴ� �迭
		double[][] distanceArr = new double[arr.length][2];
		
		// �Ÿ��� ����ϰ� �迭�� ����
		for(int i = 0; i < arr.length; ++i) {		
			distanceArr[i][0] = KNN.calcDistance(arr[i], targetArr);		
			distanceArr[i][1] = i;		
			// ���1
			System.out.println(Arrays.toString(distanceArr[i]));
		} // for i end
		
		// ����
		/*
		 * Arrays.sort(distanceArr, new Comparator<double[]>() {
		 * 
		 * @Override public int compare(double[] a, double[] b) { return
		 * Double.compare(a[0], b[0]); } });
		 */
		Arrays.sort(distanceArr, (a, b)-> Double.compare(a[0],b[0]));

		// ��� ���
		System.out.println("====================================");
		for(int i = 0; i < distanceArr.length; ++i) {
			System.out.println(Arrays.toString(distanceArr[i]));
		}
			
		// ��պ��� ������ 1�� ������ = �׼ǿ�ȭ
		if(true == calcCategory(arr, distanceArr)) {
			System.out.println("�׼� ��ȭ�Դϴ�.");
		}
		else{
			System.out.println("��� ��ȭ�Դϴ�.");
		}
		
	} // main end
	
	
	// �� �� ���� �Ÿ� ���
	private static double calcDistance(int[] arr1, int[] arr2) {
		return Math.sqrt(Math.pow(arr1[0] - arr2[0], 2) + Math.pow(arr1[1] - arr2[1], 2));
	} // getDistance end	
	
	// ī�װ� ���ϱ� true�� �׼� false�� ���
	private static boolean calcCategory(int[][] srcArr, double[][] distanceArr) {
		int mello = 0;
		int action = 0;
		
		for(int i = 0; i < 3; ++i) {
			int index = (int)distanceArr[i][1];
			
			// �׼��ΰ�? ����ΰ�?
			if(1 == srcArr[index][2]){
				++action;
			} else {
				++mello;
			}
		}

		return action >= 2;
	}
}
