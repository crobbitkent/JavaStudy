package ioStudy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class BlogCopy {

	// bad code - throws Exception
	public static void main(String[] args) throws Exception {
		 
		String path = "https://vliveplus.pstatic.net/0/campaign/2020/11/naverwithsme/hg_intro.mp4";
		URL url = new URL(path);
		
		// �о���̴� ����
		InputStream in = url.openStream();
		 
		System.out.println(in); 
		 
		// ���� ����
		OutputStream out = new FileOutputStream("C:\\testDB\\copy2.mp4");
		
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
