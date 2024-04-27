package interviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class _21_RemoveDuplicatesFromString {
	public static void main(String[] args) {
//		System.out.println("**********For given string****************");
//		String str = "hello world";
//		String result = "";
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if (result.indexOf(ch) == -1) {
//				result += ch;
//			}
//		}
//		System.out.println(result);
		
//System.out.println("------------------------------------------------------------");
		
//		System.out.println("**********For user string****************");
//
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.print("Enter a string: ");
//		String input = scanner.nextLine();
//
//		String result = removeDuplicates(input);
//		System.out.println("String after removing duplicates: " + result);
//	}
//
//	public static String removeDuplicates(String input) {
//		char[] chars = input.toCharArray();
//		Set<Character> uniqueChars = new LinkedHashSet<>();
//
//		for (char c : chars) {
//			uniqueChars.add(c);
//		}
//
//		StringBuilder sb = new StringBuilder();
//		for (char c : uniqueChars) {
//			sb.append(c);
//		}
//
//		return sb.toString();
//System.out.println("-------------------------------------------------------------");		
		System.out.println("************* Remove duplicate numbers******************");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter numbers (separated by spaces): ");
		String input = scanner.nextLine();

		// Split the input string into an array of numbers
		String[] numbers = input.split("\\s+");

		// Create a set to store unique numbers
		Set<Integer> uniqueNumbers = new HashSet<>();

		// Add numbers to the set, eliminating duplicates
		for (String number : numbers) {
			uniqueNumbers.add(Integer.parseInt(number));
		}

		// Create a list to store the unique numbers in the order of appearance
		List<Integer> uniqueList = new ArrayList<>(uniqueNumbers);

		// Print the unique numbers
		System.out.print("Unique numbers: ");
		for (Integer number : uniqueList) {
			System.out.print(number + " ");
		}
	}
}
