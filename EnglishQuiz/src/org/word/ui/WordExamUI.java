package org.word.ui;

import java.util.Scanner;

import org.word.service.WordProvider;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;




@RequiredArgsConstructor
public class WordExamUI {
	@NonNull
	private Scanner scanner;
	@NonNull
	private WordProvider provider;
	
	public void exam() {
		communicaton("������ �����ϰڽ��ϴ�.(����Ϸ��� Enter)");
		
		int length = provider.getTotalCount();
		
		for(int i = 0; i < length; ++i) {
			String answer = communicaton((1+i) + "�� ���� : " + provider.getQuiz().getDesc());
			System.out.println(provider.checkCorrect(answer));
		}
		
		communicaton("������ ��� Ǯ�����ϴ�. ����� ������....(����Ϸ��� Enter)");
		communicaton("����� ���� : " + provider.getScore());
		
	}
	
	
	public String communicaton(String out) {
		System.out.println(out);
		return scanner.nextLine();
	}
}
