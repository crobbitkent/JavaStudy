package org.word.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


/** 
 * 
 * 
 * ����ܾ�� �ܾ���� ����ִ�.
 * @author CrobbitKent
 *
 */


@AllArgsConstructor
@Getter
@ToString
public class Word {
	private String desc; // ����(����)
	private String answer; // ��
	
	/**
	 * ���� ���θ� �ҹ��ڷ� ���� ��
	 * @param user
	 * @return boolean
	 */
	public boolean checkAnswer(String user) {
		boolean result = false;
		
		// ��ҹ��� Ȯ�κ���
	    user = user.toLowerCase();
	    
	    // ��
	    if(true == user.equals(answer)) {
	    	result = true;
	    }
		
		return result;
		// return user.toLowerCase().equals(answer);
	}
}
