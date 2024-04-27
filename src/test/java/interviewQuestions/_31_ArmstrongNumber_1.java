package interviewQuestions;

public class _31_ArmstrongNumber_1 {
	//An Armstrong number in Java is a positive integer of n digits that is equal to the sum of the nth powers of their digits.
	    public static void main(String[] args) {
	        int number = 153; // Change this number to check for different Armstrong numbers

	        int originalNumber, remainder, result = 0;

	        originalNumber = number;
	        while (originalNumber != 0) {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }

	        if (result == number) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }
	}
