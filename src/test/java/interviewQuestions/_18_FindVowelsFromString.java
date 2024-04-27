package interviewQuestions;
import java.util.Scanner;

public class _18_FindVowelsFromString {

	public static void main(String args[]) {
//		String input = "Hello, World!";
//		int vowelCount = countVowels(input);
//		System.out.println("Number of vowels: " + vowelCount);
//	}
//
//	public static int countVowels(String input) {
//		int count = 0;
//		input = input.toLowerCase(); // convert the input string to lowercase for easier comparison
//
//		for (int i = 0; i < input.length(); i++) {
//			char ch = input.charAt(i);
//			if (isVowel(ch)) {
//				count++;
//			}
//		}
//
//		return count;
//	}
//
//	public static boolean isVowel(char ch) {
//		// check if the given character is a vowel
//		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
//********************************** From user input ********************************************************//
	

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();
		        scanner.close();

		        int vowelCount = countVowels(input);
		        System.out.println("Number of vowels: " + vowelCount);
		    }

		    public static int countVowels(String input) {
		        int count = 0;
		        input = input.toLowerCase(); // convert the input string to lowercase for easier comparison

		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);
		            if (isVowel(ch)) {
		                count++;
		            }
		        }

		        return count;
		    }

		    public static boolean isVowel(char ch) {
		        // check if the given character is a vowel
		        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
		    }
		}



