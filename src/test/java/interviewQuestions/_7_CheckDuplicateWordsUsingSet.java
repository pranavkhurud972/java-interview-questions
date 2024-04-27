package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class _7_CheckDuplicateWordsUsingSet {
	 public static void main(String[] args) {
	        String inputString = "This is a sample string with some duplicate words. This is a test.";

	        // Remove punctuation and split the string into words
	        String[] words = inputString.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

	        // Create a Set to store unique words
	        Set<String> uniqueWords = new HashSet<>();

	        // Create a Set to store duplicate words
	        Set<String> duplicateWords = new HashSet<>();

	        // Check for duplicates and add them to the duplicateWords Set
	        for (String word : words) {
	            if (!uniqueWords.add(word)) {
	                duplicateWords.add(word);
	            }
	        }

	        // Print the duplicate words
	        System.out.println("Duplicate words in the string:");
	        for (String duplicate : duplicateWords) {
	            System.out.println(duplicate);
	        }
	    }
}