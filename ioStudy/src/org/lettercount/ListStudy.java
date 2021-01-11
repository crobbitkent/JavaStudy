package org.lettercount;

import java.util.ArrayList;
import java.util.List;

public class ListStudy {
	public static void main(String[] args) {
		List<Letter> list = new ArrayList<>();
		
		for(int i = 97; i < 123; ++i) {
			list.add(new Letter((char)i));
		}
		
		Letter target = new Letter('t');
		
		int index = list.indexOf(target);
		
		System.out.println(index);
	}
}
