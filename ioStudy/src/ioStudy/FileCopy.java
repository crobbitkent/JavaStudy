package ioStudy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	// bad code - throws Exception
	public static void main(String[] args) throws Exception {
		 
		// �о���̴� ����
		InputStream in = new FileInputStream("C:\\testDB\\sample.jpg");
		 
		System.out.println(in); 
		 
		// ���� ����
		OutputStream out = new FileOutputStream("C:\\testDB\\copy.jpg");
		
		// read = 1 byte�� ������ �о int�� ��ȯ
		while(true) {
		
			// ���� ������ ������ -1�� ��ȯ
			int data = in.read();
			
			if(-1 == data) {
				break;
			}
			
			out.write(data);
			
		} // while end
		
		System.out.println("copy over");
	
	} // main
	
}
