package io5;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;


public class ReadTest {

	// bad code
	public static void main(String[] args) throws Exception {

		InputStream in = new FileInputStream("C:\\testDB\\data.dat");
		ObjectInputStream oin = new ObjectInputStream(in);

		Message obj = (Message)(oin.readObject());

		System.out.println(obj);

		oin.close();
		in.close();

		// data.dat = 126����Ʈ => �뷮�� �ʹ� Ŀ�� ��Ʈ��ũ�� ���� ����

	}

}
