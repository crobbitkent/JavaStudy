package io4;

import java.io.FileInputStream;
import java.util.Properties;

public class PropStudy {
	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();
		
		// 파일을 읽어서 map이 형성된다.
		prop.load(new FileInputStream("C:\\testDB\\job.properties"));
		
		System.out.println(prop);
		
		Object obj = prop.get("/menu");
		
		System.out.println(obj);
		
		
	}
}
