package d4;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40 };
		int[] arr2 = { 50, 60, 70};

		if (arr1 == arr2) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		arr2 = arr1.clone();
		
		if (arr1 == arr2) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		for	(int i = 0 ; i < arr2.length; ++i) {
			System.out.println(arr2[i]);
		}
			
	}
}
