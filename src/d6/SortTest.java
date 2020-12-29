package d6;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {
	
	
	public static void main(String[] args) {
		Integer[] arr = {34, 42, 64, 31, 56, 98};
		
		int target = 45;
		
		Arrays.sort(arr, (a,b)->Math.abs(target-a) - Math.abs(target-b));
		
		System.out.println(Arrays.toString(arr));
		// 다차원 배열
	}
}
