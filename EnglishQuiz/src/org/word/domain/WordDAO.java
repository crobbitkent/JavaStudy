package org.word.domain;


import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
public class WordDAO {
	private Word[] words;
	
	private ExcelReader reader;
	private int totalQuizNumber; // 총 문제 = 엑셀 row 개수 + 1
	
	// 생성자
	public WordDAO(String fileName) {
		this.reader = new ExcelReader(fileName);
		reader.init();
	}
	
	
	// excel 파일에서 문제를 읽어서 Word 클래스에 저장
	public void ready() {		
		totalQuizNumber = reader.getLastRowNum() + 1;
		
		words = new Word[totalQuizNumber];
		int length = words.length;
		
		for(int i = 0; i < length; ++i) {
			
			String eng = reader.getCell(i, 0).getStringCellValue();
			String kor = reader.getCell(i, 1).getStringCellValue();
			
			words[i] = new Word(kor, eng);
		}
	}

	// index에 해당하는 Word를 반환
	public Word getWord(int index) {
		return (words.length <= index) ? null : words[index];
	}
	
	// index에 해당하는 word를 str과 비교
	public boolean checkWord(int index, String str) {
		return (getWord(index).getAnswer()).equals(str);
	}
}
