package d7;

import java.util.Scanner;

// 여기에서 Memo를 뽑는다
public class MemoMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		MemoData[] box = new MemoData[5];
		int length = box.length;
		int index = (int)(Math.random() * length);
		
		for(int i = 0; i < length; ++i) {
			 box[i] = (index == i) ? new MemoData("X") : new MemoData("O");
		}
		//--------여기까지 박스를 준비하는 것------------//
		
		for(int i = 0; i < length; ++i) {
			System.out.println("마음의 준비를 하시고 Enter를 누르세요.");
			scanner.nextLine();
			
			if(box[i].showResult()) {
				System.out.println("꽝입니다.");
			} else {
				System.out.println("당첨입니다!");
			}
		} // for end
	} // main end
}
