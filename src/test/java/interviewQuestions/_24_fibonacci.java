package interviewQuestions;

import java.util.Scanner;

public class _24_fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int numTerms = input.nextInt();
		input.close();

		int firstTerm = 0, secondTerm = 1, nextTerm;
		System.out.print("Fibonacci Series up to " + numTerms + " terms: ");
		for (int i = 1; i <= numTerms; i++) {
			System.out.print(firstTerm + " ");
			nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

}
