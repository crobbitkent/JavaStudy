package io5;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class WriteTest {
	
	// bad code
	public static void main(String[] args) throws Exception {
		
		OutputStream out = new FileOutputStream("C:\\testDB\\data.dat");
		ObjectOutputStream oos = new ObjectOutputStream(out);
		
		Message obj = new Message("AAA@AAA.com", "bbb@bbb.com", "Hello, there!");
		
		oos.writeObject(obj);
		
		oos.close();
		out.close();
		
		System.out.println(obj);
		
		// data.dat = 126����Ʈ => �뷮�� �ʹ� Ŀ�� ��Ʈ��ũ�� ���� ����
		
	}
}
