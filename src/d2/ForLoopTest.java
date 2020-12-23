package d2;

public class ForLoopTest 
{
	public static void main(String[] args)
	{
		// 구구단
		
		          // 초기문  // 검사식 // 변환문
		outer:for (int i = 0; i < 10; ++i) 
		{
			System.out.println(i);
			break outer;
		}
		
		// 반복문 순서!
		// 1. 초기문(int i = 0;) => 한번만 실행된다.
		// (반복 2~4)
		// 2. 검사식(i < 10;) => boolean 타입이어야 한다.
		// 3. 내용
		// 4. 변환문(i++)
		
		
	}
}
