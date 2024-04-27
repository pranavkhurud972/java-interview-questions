package interviewQuestions;

import java.text.DecimalFormat;

public class RemoveTrailingZeros {
	public static String removeTrailingZeros(double number) {
		DecimalFormat decimalFormat = new DecimalFormat("0.#");
		return decimalFormat.format(number);
	}

	public static void main(String[] args) {
		double number1 = 2.50;
		String result1 = removeTrailingZeros(number1);
		System.out.println(result1); // Output: 1.4

		double number2 = 3.70;
		String result2 = removeTrailingZeros(number2);
		System.out.println(result2); // Output: 1.41
	}
}
