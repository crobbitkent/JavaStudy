package caesar;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CaesarCipher {
	public static void main(String[] args) throws Exception {
		InputStream fin = new FileInputStream("C:\\testDB\\caesar.txt");
		OutputStream fos = new FileOutputStream("C:\\testDB\\caesarResult.txt");
		
		decode(fin, fos);
		
	}
	
	private static void encode(InputStream fin, OutputStream fos) throws Exception {
		// String result = "";
		
		while(true) {
			// 파일 읽기
			int data = fin.read();
			
			if(-1 == data) {
				break;
			}  else if((int)'A' <= data && (int)'Z' >= data) {
				// 대문자 => 소문자
				data += 32;
			}
			
			// 문자라면
			if((int)'a' <= data && (int)'z' >= data) {
				data += 3;
				
				if(data > 122) {
					data -= 26;
				}
			}
			
			fos.write(data);
		}
	}
	
	private static void decode(InputStream fin, OutputStream fos) throws Exception {
		while(true) {
			// 파일 읽기
			int data = fin.read();
			
			if(-1 == data) {
				break;
			}  else if((int)'A' <= data && (int)'Z' >= data) {
				// 대문자 => 소문자
				data += 32;
			}
			
			// 문자라면
			if((int)'a' <= data && (int)'z' >= data) {
				data -= 3;
				
				if(data < 97) {
					data += 26;
				}
			}
			
			fos.write(data);
		}
	}
}
