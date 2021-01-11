package ioStudy;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class KeyMemo {
	
	
	// bad code - throws Exception
	public static void main(String[] args) throws Exception {
		InputStream in = System.in;
		OutputStream out = new FileOutputStream("C:\\testDB\\copy.txt");
		
		String str = "°¡³ª";
		
		byte[] arr = str.getBytes("UTF-8");
		
		System.out.println(arr.length);
		
		for(int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
			out.write(arr[i]);
		}
		
		
		
	}
	
	
	
}
