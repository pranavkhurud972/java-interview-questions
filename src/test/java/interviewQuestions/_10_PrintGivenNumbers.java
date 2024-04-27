package interviewQuestions;
import java.util.Scanner;
public class _10_PrintGivenNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Read the number of inputs
        int n = scanner.nextInt();

        // Read the newline character after the integer
        scanner.nextLine();

        // Loop through the inputs
        for (int i = 0; i < n; i++) {
            // Read each integer and print it
            int num = scanner.nextInt();
            System.out.println(num);
            
            // Read the newline character after the integer
            scanner.nextLine();
        }
        scanner.close();
	}
}
// not working