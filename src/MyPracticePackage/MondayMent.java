package MyPracticePackage;

import java.util.HashMap;
import java.util.Map;

public class MondayMent {

	public static void main(String[] args) {
		Map<Character, Integer> map1 = countChars("earth");
		Map<Character, Integer> map2 = countChars("heart");
		System.out.println(map1.equals(map2));

		// int[] arr = { 5, 2, 2, 1, 1 };
		// String s = "dinara";
		// as a key/index as a value
		// if this map contains that value you will add 1
		// if doesn't contain create one new
//		Map<Character, Integer> map = new HashMap<>();
//		//map.put('a', 5);
//		//System.out.println(map.get('a'));
//		//System.out.println(arr[0]);
//		for(char ch: s.toCharArray()) {
//			if(!map.containsKey(ch)) {
//				map.put(ch, 1 );
//		} else {
//			map.put(ch, map.get(ch)+1);
//		}
//		}
//  System.out.println(map);
//  
	}

	public static Map<Character, Integer> countChars(String word) {
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : word.toLowerCase().toCharArray()) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}

		}
		return map;

	}
}
