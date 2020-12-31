package d5;

// 함수 만들기
public class FunctionTest1 {
	// 0. 범위 키워드 public static
	// 1. 이름 만들기 -> 로직 -> 동사 = contains() { ... }
	// 2. 입력되는 값 = (타입 변수이름, 타입 변수이름, 타입 변수이름, ...)
	// 3. 결과 타입
	// 4. 로직
	public static boolean contains(final int[] arr, final int number) {
		boolean result = false;
		int length = arr.length;
		
		for(int i = 0; i < length; ++i) {
			// 같은 숫자가 이미 있다면
			if(number == arr[i]) {
				result = true;
				break;
			}
		}
		
		return result;
	}
}
