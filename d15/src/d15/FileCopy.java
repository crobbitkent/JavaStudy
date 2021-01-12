package d15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	
	// throws Exception을 반환값처럼 생각하라.
	
	public static void main(String[] args) throws Exception {
		// 26 byte
		InputStream fin = new FileInputStream("C:\\testDB\\caesar.txt");
		OutputStream fos = new FileOutputStream("C:\\testDB\\caesar2.txt");
		
		
		long start = System.currentTimeMillis();
		
		// while
		copyBuffer(fin, fos);
		
		long end = System.currentTimeMillis();
		
		long result = end - start;
		
		// System.out.println(result);
		
		// 반드시 해야한다.
		fin.close();
		fos.close();
	}
	
	// 272083 ms
	private static void copyByte(InputStream fin, OutputStream fos) throws Exception {
		while(true) {
			int data = fin.read();
			
			if(-1 == data) { break;}
			
			fos.write(data);
		}
	}
	
	// 97 ms
	private static void copyBuffer(InputStream fin, OutputStream fos) throws Exception {
		byte[] buffer = new byte[5]; // 1024 * 8 = 8 kB
		
		while(true) {
			int count = fin.read(buffer);

			if(-1 == count) { break;}
			
			fos.write(buffer, 0, count);
			
			System.out.println(count);
		}
		System.out.println("copy done");
	}
	
}
