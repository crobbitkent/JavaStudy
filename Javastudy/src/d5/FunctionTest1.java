package d5;

// �Լ� �����
public class FunctionTest1 {
	// 0. ���� Ű���� public static
	// 1. �̸� ����� -> ���� -> ���� = contains() { ... }
	// 2. �ԷµǴ� �� = (Ÿ�� �����̸�, Ÿ�� �����̸�, Ÿ�� �����̸�, ...)
	// 3. ��� Ÿ��
	// 4. ����
	public static boolean contains(final int[] arr, final int number) {
		boolean result = false;
		int length = arr.length;
		
		for(int i = 0; i < length; ++i) {
			// ���� ���ڰ� �̹� �ִٸ�
			if(number == arr[i]) {
				result = true;
				break;
			}
		}
		
		return result;
	}
}
