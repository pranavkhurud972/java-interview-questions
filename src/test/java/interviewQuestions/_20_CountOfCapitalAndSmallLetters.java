package interviewQuestions;

import java.util.Scanner;

public class _20_CountOfCapitalAndSmallLetters {
	public static void main(String[] args) {
//		System.out.println("**********For given string****************");
//		String str = "Hello World";
//		int capitalCount = 0;
//		int smallCount = 0;
//
//		for (char c : str.toCharArray()) {
//			if (Character.isUpperCase(c)) {
//				capitalCount++;
//			} else if (Character.isLowerCase(c)) {
//				smallCount++;
//			}
//		}
//		System.out.println("Number of capital letters: " + capitalCount);
//		System.out.println("Number of small letters: " + smallCount);

		System.out.println("**********For user input****************");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		int capitalCount = 0;
		int smallCount = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				capitalCount++;
				System.out.println("'" + ch + "' is a capital letter.");
			} else if (Character.isLowerCase(ch)) {
				smallCount++;
				System.out.println("'" + ch + "' is a small letter.");
			}
		}

		System.out.println("Number of capital letters: " + capitalCount);
		System.out.println("Number of small letters: " + smallCount);

		scanner.close();

	}
}
