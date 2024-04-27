package interviewQuestions;

/*
 * Read two integer values. After this, calculate the product between them and store the result in a variable named PROD. Print the result like the example below. Do not forget to print the end of line after the result, otherwise you will receive â€œPresentation Errorâ€?.

Input
The input file contains 2 integer numbers.

Output
Print the message "PROD" and PROD according to the following example, with a blank space before and after the equal signal.

Input Samples	Output Samples
3
9

PROD = 27

-30
10

PROD = -300

0
9

PROD = 0
 */
import java.util.Scanner;

public class _11_MultiplyTwoNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read the two integer values
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		// Calculate the product
		int prod = a * b;

		// Print the result
		System.out.println("PROD = " + prod);

//		scanner.close();
//
//		int p = 4;
//		int q = 8;
//		int o = p * q;
//		System.out.println(o);
	}
}
