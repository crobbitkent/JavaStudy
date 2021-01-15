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

		// data.dat = 126바이트 => 용량이 너무 커서 네트워크에 맞지 않음

	}

}
