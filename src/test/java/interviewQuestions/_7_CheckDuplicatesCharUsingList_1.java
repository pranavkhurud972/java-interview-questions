package interviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _7_CheckDuplicatesCharUsingList_1 {

	public static List<Character> findDuplicateCharacters(String input) {
		List<Character> duplicates = new ArrayList<>();
		Map<Character, Integer> charCountMap = new HashMap<>();

		// Convert the input string to lowercase for case-insensitive comparison
		input = input.toLowerCase();

		// Iterate through the characters in the input string
		for (char c : input.toCharArray()) {
			// Ignore non-alphabetical characters
			if (Character.isLetter(c)) {
				// If the character is already in the charCountMap, increment its count
				if (charCountMap.containsKey(c)) {
					charCountMap.put(c, charCountMap.get(c) + 1);
				} else {
					charCountMap.put(c, 1);
				}
			}
		}

		// Iterate through the charCountMap to find duplicate characters
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				duplicates.add(entry.getKey());
			}
		}

		return duplicates;
	}

	public static void main(String[] args) {
		String input = "Hello, World!";
		List<Character> duplicateChars = findDuplicateCharacters(input);

		System.out.println("Duplicate characters in the string:");
		for (char c : duplicateChars) {
			System.out.println(c);
		}
	}
}
