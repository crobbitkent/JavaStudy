package BBB;

import java.util.Arrays;
import java.util.Scanner;

import lombok.AllArgsConstructor;


public class MemoService {
	
	// 의존적인 객체 혹은 데이터는 주입하자.
	private Memo[] memoBox;
	private int count = 0; // 박스에 들어있는 메모 개수
	
	// 10이라면 
	public void readyMemo(int count) {
		this.count = count;
		memoBox = new Memo[count];
		
		// 0~9
		int ran = (int)(Math.random() * count);
		
		for(int i = 0; i < count; ++i) {
			// 랜덤한 숫자에 X가 들어가있다.
			if(ran == i) {
				memoBox[i] = new Memo("X");
			} else {
				memoBox[i] = new Memo("O");
			}		
		}
	}
	
	
	public Memo getNextMemo() {
		Memo result = memoBox[0];

		arrangeBox();
		
		return result;
	}
	
	private void arrangeBox() {
		Memo[] newBox = new Memo[--count];
		
		for(int i = 0; i < count; ++i) {
			newBox[i] = memoBox[i + 1];
		}
		
		memoBox = newBox;

		// 이런 식으로
		// Arrays.copyOfRange(memoBox, 1, newBox, 0);
	}

}
