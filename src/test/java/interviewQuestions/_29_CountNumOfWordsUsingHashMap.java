package interviewQuestions;

import java.util.HashMap;

public class _29_CountNumOfWordsUsingHashMap {

	public static void main(String[] args) {
		String inputString = "This is a sample string with some words. This is a test.";

		// Remove punctuation and split the string into words
		String[] words = inputString.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

		// Create a HashMap to store word counts
		HashMap<String, Integer> wordCountMap = new HashMap<>();

		// Count the occurrences of each word
		for (String word : words) {
			wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
		}

		// Print the word counts
		for (String word : wordCountMap.keySet()) {
			int count = wordCountMap.get(word);
			System.out.println(word + ": " + count);
		}
	}
}
