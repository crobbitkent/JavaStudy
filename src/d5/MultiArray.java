package d5;

// 12/28 월요일
public class MultiArray{
	
	public static void main(String[] args) {
		// 다차원 배열 : 어떤 배열을 배열로 묶을 것인가?
		int[][] arr = {{1,2},{4,3},{10,6}};
		
		arr[0][0] = 100;
		
		System.out.println(arr); // 주소
		System.out.println(arr[0]); // 주소
		System.out.println(arr[0][0]); // 값
		
		int[][] arr2 = new int[10][];
		
		
	}
}
