package BBB;

import java.util.Arrays;
import java.util.Scanner;

import lombok.AllArgsConstructor;


public class MemoService {
	
	// �������� ��ü Ȥ�� �����ʹ� ��������.
	private Memo[] memoBox;
	private int count = 0; // �ڽ��� ����ִ� �޸� ����
	
	// 10�̶�� 
	public void readyMemo(int count) {
		this.count = count;
		memoBox = new Memo[count];
		
		// 0~9
		int ran = (int)(Math.random() * count);
		
		for(int i = 0; i < count; ++i) {
			// ������ ���ڿ� X�� ���ִ�.
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

		// �̷� ������
		// Arrays.copyOfRange(memoBox, 1, newBox, 0);
	}

}
