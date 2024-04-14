package code.study;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		//입력
		map.put("one", 1);
		map.put("two", 2);
		map.put("two", 22); //키중복 발생시, value를 치환함 2->22 뒤에 값이 마지막으로..
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		
		System.out.println("map의 사이즈: "+ map.size());

		map.remove("five");
		System.out.println("map의 사이즈: "+ map.size());
		
		System.out.println("map has that key name is one: "  +map.containsKey("one"));
		System.out.println("map has that key name is six: "  +map.containsKey("six"));
		
		System.out.println("map has value 1: "+ map.containsValue(1));
		System.out.println("map has value 2: "+ map.containsValue(22));
		System.out.println("map has value 22: "+ map.containsValue(2));
		
		//출력형태
		//key - 자주 쓰임 .. 성능상 효율적 
		Set<String> keySet = map.keySet();
		
		for(String key : keySet) {
			System.out.println("key: "+ key+ ", value: "+ map.get(key));
		}
		
		System.out.println("=======================================================");
		
		//Entry
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Map.Entry<String, Integer> en: entrySet) {
			System.out.println("key: "+ en.getKey()+ ", value: "+ en.getValue());
		}
		
		
		
		
		
		
	}

}
