package d5;

import java.util.Arrays;
import java.util.Comparator;

public class KNN {
	public static void main(String[] args) {		
		// 다차원 배열 1 = 액션, 2 = 멜로
		final int[][] arr = {
				{6,4,1},
				{7,2,1},
				{5,2,1},
				{4,5,2},
				{3,4,2},
				{3,2,2}
		};
		
		// 목표 점
		int[] targetArr = {4,2};
		
		// 거리(0)와 인덱스(1)를 저장하는 배열
		double[][] distanceArr = new double[arr.length][2];
		
		// 거리를 계산하고 배열에 보관
		for(int i = 0; i < arr.length; ++i) {		
			distanceArr[i][0] = KNN.calcDistance(arr[i], targetArr);		
			distanceArr[i][1] = i;		
			// 출력1
			System.out.println(Arrays.toString(distanceArr[i]));
		} // for i end
		
		// 정렬
		/*
		 * Arrays.sort(distanceArr, new Comparator<double[]>() {
		 * 
		 * @Override public int compare(double[] a, double[] b) { return
		 * Double.compare(a[0], b[0]); } });
		 */
		Arrays.sort(distanceArr, (a, b)-> Double.compare(a[0],b[0]));

		// 결과 출력
		System.out.println("====================================");
		for(int i = 0; i < distanceArr.length; ++i) {
			System.out.println(Arrays.toString(distanceArr[i]));
		}
			
		// 평균보다 작으면 1에 가깝다 = 액션영화
		if(true == calcCategory(arr, distanceArr)) {
			System.out.println("액션 영화입니다.");
		}
		else{
			System.out.println("멜로 영화입니다.");
		}
		
	} // main end
	
	
	// 두 점 간의 거리 계산
	private static double calcDistance(int[] arr1, int[] arr2) {
		return Math.sqrt(Math.pow(arr1[0] - arr2[0], 2) + Math.pow(arr1[1] - arr2[1], 2));
	} // getDistance end	
	
	// 카테고리 구하기 true면 액션 false면 멜로
	private static boolean calcCategory(int[][] srcArr, double[][] distanceArr) {
		int mello = 0;
		int action = 0;
		
		for(int i = 0; i < 3; ++i) {
			int index = (int)distanceArr[i][1];
			
			// 액션인가? 멜로인가?
			if(1 == srcArr[index][2]){
				++action;
			} else {
				++mello;
			}
		}

		return action >= 2;
	}
}
