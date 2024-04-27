package interviewQuestions;
/*
 * Read two floating points' values of double precision A and B, corresponding to two student's grades. After this, calculate the student's average, considering that grade A has weight 3.5 and B has weight 7.5. Each grade can be from zero to ten, always with one digit after the decimal point. Don’t forget to print the end of line after the result, otherwise you will receive “Presentation Error�?. Don’t forget the space before and after the equal sign.

Input
The input file contains 2 floating points' values with one digit after the decimal point.

Output
Print the message "MEDIA"(average in Portuguese) and the student's average according to the following example, with 5 digits after the decimal point and with a blank space before and after the equal signal.

Input Samples	Output Samples
5.0
7.1

MEDIA = 6.43182

0.0
7.1

MEDIA = 4.84091

10.0
10.0

MEDIA = 10.00000
 */
import java.util.Scanner;

public class _12_AvgBetweenTwoNum {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    // Read the two floating-point values
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();

    // Calculate the weighted average
    double weightedAverage = (a * 3.5 + b * 7.5) / (3.5 + 7.5);

    // Print the result
    System.out.printf("MEDIA = %.5f%n", weightedAverage);

    scanner.close();
}
}
