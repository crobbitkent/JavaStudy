package d6;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort2 {
	public static void main(String[] args) {
		int[] arr = {8,5,7,3,0,5,2,4,1,10};
		
		sortBubble(arr);
		
		System.out.println(Arrays.toString(arr));
	} // main end
	
	private static void swap(int index1, int index2, int[] arr){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	private static void sortBubble(int[] arr) {
		int length = arr.length;
		
		for(int i = length - 1; i > 0; --i) {
			for(int j = 0; j < i; ++j) {
				// 뒤에 있는 값이 작으면 앞으로 당긴다.
				if(arr[j] > arr[j + 1]) {
					swap(j, j+1, arr);
				}
			} // for j end
		} // for i end
	}
}
