package d17;

import java.util.HashMap;
import java.util.Map;

public class MapStudy {
	
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		// key가 중요하다. put이라고 넣을 때, 똑같은 key값을 넣으면 덮어쓴다.
		map.put("A", "AAA");
		map.put("B", "AAA");
		map.put("E", "AAA");
		map.put("C", "AAA");
		
		// key 별로 자동 정렬된다.
		System.out.println(map);
		
		// key 목록과 value목록을 가져올 수 있다.
		// 이걸로 순회할 수 있다.
		map.keySet().forEach(key -> System.out.println(key));
		map.values().forEach(value -> System.out.println(value));
		
		// 내용물 확인 방법1
		map.containsKey("A");
		map.containsValue("AAA");
		
		// 내용물 확인 방법2 : 이런 방법을 많이 쓴다.
		if(null != map.get("A")) {
			
		}
		
		// 
	}
	
	
}
