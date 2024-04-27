package interviewQuestions;

import java.util.Scanner;

public class _17_StringNumberPalindrome {
	public static void main(String[] args) {
//************************** String palindrome ***************************//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println(" Enter a string:");
//		String str = scanner.nextLine();
//
//		String reversed = "";
//		for (int i = str.length() - 1; i >= 0; i--) {
//			reversed += str.charAt(i);
//		}
//		System.out.println(" Reversed string:" + reversed);
//		if (str.equalsIgnoreCase(reversed)) {
//			System.out.println(str + " is a palindrome");
//		} else {
//			System.out.println(str + " is not a palindrome");
//		}
//***************************** Number/String palindrome *****************************//
		String original, 
		reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a num/string :");
		original = in.nextLine();

		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		if (original.equals(reverse)) {
			System.out.println("Entered string/number is a palindrome.");
		} else {
			System.out.println("Entered string/number isn't a palindrome.");
		}

	}
}
