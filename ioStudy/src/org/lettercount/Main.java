package org.lettercount;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		// 파일 읽기
		InputStream in = new FileInputStream("C:\\testDB\\alice.txt");
		
		Letter[] arr = new Letter[26];
		
		for(int i = (int)'a'; i < (int)'z' + 1; ++i)
		{
			arr[i - (int)'a'] = new Letter((char)i);
		}
		
		// 65~90 : 대문자 
		// 97~122 : 소문자
		// 격차 = 32
		while(true) {
			int data = in.read();
			
			if(-1 == data) {
				break;
			}  else if((int)'A' <= data && (int)'Z' >= data) {
				data += 32;
			}
			
			if((int)'a' <= data && (int)'z' >= data) {
				arr[data - (int)'a'].plusCount();
			}
		}
		
		// 정렬
		
		
		
		System.out.println(Arrays.toString(arr));
		
	}
}
