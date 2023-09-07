package java1;

import java.util.HashMap;
import java.util.Map;

public class logical_07_09_2023 {

	public static void countCharacters(String input) {

		Map<Character, Integer> charCountMap = new HashMap<>();

		input = input.replaceAll("\\s", "").toLowerCase();

		for (char ch : input.toCharArray()) {
			
			if (charCountMap.containsKey(ch)) {

				charCountMap.put(ch, charCountMap.get(ch) + 1);
			} else {

				charCountMap.put(ch, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			
			System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		
		String input = "String Occurrence and Character Count Program";
		
		countCharacters(input);
	}
}
