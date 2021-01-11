package ioStudy;

import java.util.Arrays;

public class StringStudy {

	public static void main(String[] args) {
		{
			String str1 = "aaa";

			String str2 = new String("bbb");
			// 이것은 굉장히 비효율적인 코드
			// 그래서 쓰지 마라...

			System.out.println(str1 == str2);
		}
		{
			String temp = "ABCDEFG";
			// 1. 지정된 위치에서 끝까지
			String temp1 = temp.substring(3);
			System.out.println(temp1);

			// 2. 지정된 위치에서 특정한 위치 전까지
			temp1 = temp.substring(0, 3);
			System.out.println(temp1);
		}
		{
			String str = "Hello, world! My name is Alice.";
			// 없다면 -1
			int index = str.indexOf("My");
			System.out.println(index);
		}
		{
			String origin = "abcde";
			byte[] arr = origin.getBytes();
			System.out.println(Arrays.toString(arr));
		}
	}

}
