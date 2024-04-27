package interviewQuestions;

import java.util.Scanner;

public class _22_SwapTwoNumbers {
//	Swap to numbers without temporary variable  
	public static void main(String[] args) {
//		System.out.println("********************For given numbers*******************");
//		int num1 = 10;
//		int num2 = 20;
//		System.out.println("Before swapping, num1 = " + num1 + " and num2 = " + num2);
//
//		num1 = num1 + num2;
//		num2 = num1 - num2;
//		num1 = num1 - num2;
//
//		System.out.println("After swapping, num1 = " + num1 + " and num2 = " + num2);
//System.out.println("-----------------------------------------------------------------");
		

		System.out.println("******************For user input************************");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int a = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int b = scanner.nextInt();

		System.out.println("Before swapping:");
		System.out.println("First number: " + a);
		System.out.println("Second number: " + b);

		// Swap numbers without using a temporary variable
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("After swapping:");
		System.out.println("First number: " + a);
		System.out.println("Second number: " + b);

	}
	
	//other way:
//	static void swap(int a,int b) {
////	int temp=a;
////	a=b;
////	b=temp;
//	}
}
