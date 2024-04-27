package interviewQuestions;

public class _25_CountNumAlphaSplChar {
	public static void main(String[] args) {
		System.out.println(" ****************** For given string***********************");
		String inputString = "Hello123@#$";
		int digitCount = 0;
		int alphabetCount = 0;
		int specialCharCount = 0;

		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if (Character.isDigit(ch)) {
				digitCount++;
			} else if (Character.isLetter(ch)) {
				alphabetCount++;
			} else {
				specialCharCount++;
			}
		}

		System.out.println("Number of digits: " + digitCount);
		System.out.println("Number of alphabets: " + alphabetCount);
		System.out.println("Number of special characters: " + specialCharCount);
		System.out.println("---------------------------------------------------------------");
//		System.out.println("******************For user input***********************");
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter a string: ");
//		String input = scanner.nextLine();
//		int countAlphabets = 0;
//		int countNumbers = 0;
//		int countSpecialChars = 0;
//		for (int i = 0; i < input.length(); i++) {
//			char ch = input.charAt(i);
//			if (Character.isAlphabetic(ch)) {
//				countAlphabets++;
//			} else if (Character.isDigit(ch)) {
//				countNumbers++;
//			} else {
//				countSpecialChars++;
//			}
//		}
//
//		System.out.println("Number of alphabets: " + countAlphabets);
//		System.out.println("Number of numbers: " + countNumbers);
//		System.out.println("Number of special characters: " + countSpecialChars);
	}

}
