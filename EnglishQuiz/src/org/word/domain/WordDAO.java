package org.word.domain;


import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
public class WordDAO {
	private Word[] words;
	
	private ExcelReader reader;
	private int totalQuizNumber; // �� ���� = ���� row ���� + 1
	
	// ������
	public WordDAO(String fileName) {
		this.reader = new ExcelReader(fileName);
		reader.init();
	}
	
	
	// excel ���Ͽ��� ������ �о Word Ŭ������ ����
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

	// index�� �ش��ϴ� Word�� ��ȯ
	public Word getWord(int index) {
		return (words.length <= index) ? null : words[index];
	}
	
	// index�� �ش��ϴ� word�� str�� ��
	public boolean checkWord(int index, String str) {
		return (getWord(index).getAnswer()).equals(str);
	}
}
