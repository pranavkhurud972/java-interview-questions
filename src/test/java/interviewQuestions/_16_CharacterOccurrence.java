package interviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _16_CharacterOccurrence {
	public static void main(String[] args) {

//*****************************Find char occurance in given string*******************	
//System.out.println("*****************************Find char occurance in given string*******************************");
//	 String input = "Hello, World!";
//     Map<Character, Integer> occurrenceMap = countCharacterOccurrence(input);
//
//     // Print the occurrence of each character
//     for (Map.Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
//         System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " time(s)");
//     }
// }
//
// public static Map<Character, Integer> countCharacterOccurrence(String input) {
//     Map<Character, Integer> occurrenceMap = new HashMap<>();
//
//     // Iterate over each character in the input string
//     for (char ch : input.toCharArray()) {
//         // Skip whitespace and punctuation marks
//         if (Character.isWhitespace(ch) || !Character.isLetterOrDigit(ch)) {
//             continue;
//         }
//
//         // Convert to lowercase to ignore case sensitivity
//         ch = Character.toLowerCase(ch);
//
//         // Update the count in the map
//         occurrenceMap.put(ch, occurrenceMap.getOrDefault(ch, 0) + 1);
//     }
//
//     return occurrenceMap;
// }
//}

//****************** Another example******************************	
//System.out.println("*****************************Find char occurance in given string another example*******************************");		
//		String str = "Hello World";
//		HashMap<Character, Integer> charCount = new HashMap<>();
//
//		for (char c : str.toCharArray()) {
//			if (charCount.containsKey(c)) {
//				charCount.put(c, charCount.get(c) + 1);
//			} else {
//				charCount.put(c, 1);
//			}
//		}
//
//		for (char c : charCount.keySet()) {
//			System.out.println(c + " : " + charCount.get(c));
//		}

//******************************** For User Input ************************************************************//

		System.out.println("*******************Find char occurance for user input*********************");

		Scanner scanner = new Scanner(System.in);

		// Read the input from the user
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		Map<Character, Integer> occurrences = getCharacterOccurrences(input);

		// Print the occurrences of each character
		for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	public static Map<Character, Integer> getCharacterOccurrences(String input) {
		Map<Character, Integer> occurrences = new HashMap<>();

		// Iterate over each character in the input string
		for (char c : input.toCharArray()) {
			// Ignore whitespace and punctuation marks
			if (Character.isLetterOrDigit(c)) {
				// If the character is already present in the map, increment its count
				// Otherwise, add it to the map with a count of 1
				occurrences.put(c, occurrences.getOrDefault(c, 0) + 1);
			}
		}

		return occurrences;
	}
}
