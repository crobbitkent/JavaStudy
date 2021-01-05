package org.word.service;

import org.word.domain.Word;
import org.word.domain.WordDAO;

import lombok.Getter;

// service class
@Getter
public class WordProvider {
	private WordDAO dao;
	private int index;
	private int totalCount;
	private int correctCount;
	
	
	public WordProvider() {
		this.dao = new WordDAO("C:\\testDB\\QuizList.xlsx");
		this.index = 0;
		dao.ready();
		totalCount = dao.getTotalQuizNumber();
	}
	
	
	public Word getQuiz() {
		Word result = null;
				
		if(index >= totalCount) {
			return result;
		}				
		
		return dao.getWord(index);
	}
	
	public String checkCorrect(String check) {
		// 이제 여기서 index를 올려주고 다음 문제로 간다.
		if(dao.checkWord(index++, check)) {
			++correctCount;
			return "맞았습니다.";
		}
		
		return "틀렸습니다.";
	}
	
	public String getScore() {
		int score = (int)((correctCount / (double)totalCount) * 100);
			
		return score + "점입니다. (" + correctCount + " / " + totalCount + ")";
	}
	
	
}
