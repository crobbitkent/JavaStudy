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
		communicaton("문제를 시작하겠습니다.(계속하려면 Enter)");
		
		int length = provider.getTotalCount();
		
		for(int i = 0; i < length; ++i) {
			String answer = communicaton((1+i) + "번 문제 : " + provider.getQuiz().getDesc());
			System.out.println(provider.checkCorrect(answer));
		}
		
		communicaton("문제를 모두 풀었습니다. 당신의 점수는....(계속하려면 Enter)");
		communicaton("당신의 점수 : " + provider.getScore());
		
	}
	
	
	public String communicaton(String out) {
		System.out.println(out);
		return scanner.nextLine();
	}
}
