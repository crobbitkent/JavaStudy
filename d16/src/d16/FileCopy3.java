package d16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy3 {
	public static void main(String[] args) {
		// close 규칙
		// 1. 반드시 finally에서 해야한다.
		// 2. 여러 개를 close할 떄 각각 따로 해야한다.
		
		// 불편한 점
		// 1. 변수를 바깥쪽에 선언해야
		// 2. 매번 따로따로 close()
		// 3. copy & paste 문제
		
		InputStream fin = null;
		OutputStream fos = null;
		
		try {
			fin = new FileInputStream("C:\\testDB\\sample.jpg"); // 파일이 없으면 여기서 바로 catch => finally
			fos = new FileOutputStream("C:\\testDB\\sample2.jpg");
			
			byte[] buffer = new byte[1024 *8];
			
			while(true) {
				int count = fin.read(buffer);
				
				if(-1 == count) { break;}
				
				fos.write(buffer, 0, count);
			}
			
			fin.close();
			fin = null;
			fos.close();
			fos = null;
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 성공, 실패 여부와 상관 없이 실행된다.
			if(null != fin) { try {fin.close();} catch(Exception e) {}}
			if(null != fos) { try {fos.close();} catch(Exception e) {}}
		} // try end
		
		
		
		
		
		
	}
}
