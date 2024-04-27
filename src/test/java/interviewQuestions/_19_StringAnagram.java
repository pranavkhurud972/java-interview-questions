package interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

// Anagrams: If one word is became same to other by rearranging alphabets
//public class _19_StringAnagram {
//	public static void main(String[] args) {
//		System.out.println("******************* for given input***********************");		
//		String s1 = "race";
//		String s2 = "care";
//		if (isAnagram(s1, s2)) {
//			System.out.println("The two strings are anagrams.");
//		} else {
//			System.out.println("The two strings are not anagrams.");
//		}
//	}
//
//	public static boolean isAnagram(String s1, String s2) {
//		// Remove spaces and convert to lowercase
//		s1 = s1.replaceAll("\\s", "").toLowerCase();
//		s2 = s2.replaceAll("\\s", "").toLowerCase();
//		// Check if the two strings are of same length
//		if (s1.length() != s2.length()) {
//			return false;
//		}
//		// Convert the strings to character arrays
//		char[] s1Arr = s1.toCharArray();
//		char[] s2Arr = s2.toCharArray();
//		// Sort the character arrays
//		Arrays.sort(s1Arr);
//		Arrays.sort(s2Arr);
//		// Compare the sorted character arrays
//		return Arrays.equals(s1Arr, s2Arr);
//}
//}
//System.out.println("******************* for user input***********************");	

public class _19_StringAnagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String str1 = scanner.nextLine();

		System.out.print("Enter the second string: ");
		String str2 = scanner.nextLine();

		if (isAnagram(str1, str2)) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");
		}

		scanner.close();
	}

	public static boolean isAnagram(String str1, String str2) {
		// Removing whitespace and converting to lowercase
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

		// Checking if lengths are equal
		if (str1.length() != str2.length()) {
			return false;
		}

		// Converting strings to character arrays and sorting
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// Comparing sorted arrays
		return Arrays.equals(arr1, arr2);
	}
}
