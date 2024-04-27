package interviewQuestions;
/*
 * User
Read three values (variables A, B and C), which are the three student's grades. Then, calculate the average, considering that grade A has weight 2, grade B has weight 3 and the grade C has weight 5. Consider that each grade can go from 0 to 10.0, always with one decimal place.

Input
The input file contains 3 values of floating points (double) with one digit after the decimal point.

Output
Print the message "MEDIA"(average in Portuguese) and the student's average according to the following example, with a blank space before and after the equal signal.

Input Samples	Output Samples
5.0
6.0
7.0

MEDIA = 6.3

5.0
10.0
10.0

MEDIA = 9.0

10.0
10.0
5.0

MEDIA = 7.5
 */
import java.util.Scanner;
public class _13_AvgBetweenThreeNum {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	// Read the three floating-point values
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();

    // Calculate the weighted average
    double weightedAverage = (a * 2 + b * 3 + c * 5) / (2 + 3 + 5);

    // Print the result
    System.out.printf("MEDIA = %.1f%n", weightedAverage);

    scanner.close();
}
}
