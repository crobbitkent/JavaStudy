package d4;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40 };
		int[] arr2 = { 50, 60, 70};

		if (arr1 == arr2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		arr2 = arr1.clone();
		
		if (arr1 == arr2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		for	(int i = 0 ; i < arr2.length; ++i) {
			System.out.println(arr2[i]);
		}
			
	}
}
