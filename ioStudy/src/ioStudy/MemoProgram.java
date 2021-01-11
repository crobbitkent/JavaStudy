package ioStudy;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class MemoProgram {

	public static void main(String[] args) throws Exception {
		// 시스템에서 정보를 받는다. (in)
		Scanner scanner = new Scanner(System.in);
		// file로 저장한다. (out)
		OutputStream fos = new FileOutputStream("C:\\testDB\\diary.txt", true);

		System.out.println("입력하세요.");
		// 구분자(\n)
		String str = scanner.nextLine() + "\n";
		byte[] arr = str.getBytes("UTF-8");

		for (int j = 0; j < arr.length; ++j) {
			fos.write(arr[j]);
		}		
	}
}
