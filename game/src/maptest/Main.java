package maptest;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		// key와 value
		Map<String, String> map = new HashMap<>();
		map.put("banana", "바나나");
		map.put("apple", "사과");
		
		String answer1 = map.get("banana");
		String answer2 = map.get("apple");
	}
}
