package d7;

import java.util.Scanner;

// ���⿡�� Memo�� �̴´�
public class MemoMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		MemoData[] box = new MemoData[5];
		int length = box.length;
		int index = (int)(Math.random() * length);
		
		for(int i = 0; i < length; ++i) {
			 box[i] = (index == i) ? new MemoData("X") : new MemoData("O");
		}
		//--------������� �ڽ��� �غ��ϴ� ��------------//
		
		for(int i = 0; i < length; ++i) {
			System.out.println("������ �غ� �Ͻð� Enter�� ��������.");
			scanner.nextLine();
			
			if(box[i].showResult()) {
				System.out.println("���Դϴ�.");
			} else {
				System.out.println("��÷�Դϴ�!");
			}
		} // for end
	} // main end
}
