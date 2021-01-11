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
		
		// 읽어들이는 빨대
		InputStream in = url.openStream();
		 
		System.out.println(in); 
		 
		// 쓰는 빨대
		OutputStream out = new FileOutputStream("C:\\testDB\\copy2.mp4");
		
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
