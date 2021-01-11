package ioStudy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	// bad code - throws Exception
	public static void main(String[] args) throws Exception {
		 
		// 읽어들이는 빨대
		InputStream in = new FileInputStream("C:\\testDB\\sample.jpg");
		 
		System.out.println(in); 
		 
		// 쓰는 빨대
		OutputStream out = new FileOutputStream("C:\\testDB\\copy.jpg");
		
		// read = 1 byte의 내용을 읽어서 int로 반환
		while(true) {
		
			// 읽을 파일이 없으면 -1을 반환
			int data = in.read();
			
			if(-1 == data) {
				break;
			}
			
			out.write(data);
			
		} // while end
		
		System.out.println("copy over");
	
	} // main
	
}
