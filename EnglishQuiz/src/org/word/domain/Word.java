package org.word.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


/** 
 * 
 * 
 * 영어단어와 단어설명이 담겨있다.
 * @author CrobbitKent
 *
 */


@AllArgsConstructor
@Getter
@ToString
public class Word {
	private String desc; // 설명(질문)
	private String answer; // 답
	
	/**
	 * 정답 여부를 소문자로 만들어서 비교
	 * @param user
	 * @return boolean
	 */
	public boolean checkAnswer(String user) {
		boolean result = false;
		
		// 대소문자 확인부터
	    user = user.toLowerCase();
	    
	    // 비교
	    if(true == user.equals(answer)) {
	    	result = true;
	    }
		
		return result;
		// return user.toLowerCase().equals(answer);
	}
}
