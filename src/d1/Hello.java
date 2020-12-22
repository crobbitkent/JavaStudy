package d1;

// 12/22 화요일
public class Hello {
	public static void main(String[] args)
	{
		String str = "12345";
		String str2 = str;
		str2 += "1";
		
		System.out.println(str2); // 123451
		System.out.println(str);  // 12345
	}
}
