package interviewQuestions;
/*
 * The formula to calculate the area of a circumference is defined as A = π . R2. Considering to this problem that π = 3.14159:

Calculate the area using the formula given in the problem description.

Input
The input contains a value of floating point (double precision), that is the variable R.

Output
Present the message "A=" followed by the value of the variable, as in the example bellow,with four places after the decimal point.
 Use all double precision variables. 
 Like all the problems, don't forget to print the end of line after the result, otherwise you will receive "Presentation Error".
 */
import java.util.Scanner;
public class _8_AreaOfCircle {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the radius value (R)
	        double R = scanner.nextDouble();

	        // Calculate the area (A)
	        double pi = 3.14159;
	        double A = pi * R * R;

	        // Print the result with four decimal places
	        System.out.printf("A=%.4f%n", A);
	    }
	}


