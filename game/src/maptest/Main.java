package maptest;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		// key�� value
		Map<String, String> map = new HashMap<>();
		map.put("banana", "�ٳ���");
		map.put("apple", "���");
		
		String answer1 = map.get("banana");
		String answer2 = map.get("apple");
	}
}
