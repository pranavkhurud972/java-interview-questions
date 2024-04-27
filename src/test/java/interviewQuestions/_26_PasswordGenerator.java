package interviewQuestions;
import java.util.Random;

public class _26_PasswordGenerator {

	private static final String LOWERCASE_LETTERS="abcdefghijklmnopqrstuvwxyz";
	private static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String DIGITS="0123456789";
	private static final String SPECIAL_CHARACTERS="!@#$%^&*()-_+=<>?";
	
	
	public static void main(String[] args) {
		int length=12;
		String charSet = LOWERCASE_LETTERS + UPPERCASE_LETTERS + DIGITS + SPECIAL_CHARACTERS;
		String password = generatePassword(length,charSet);
		System.out.println("Generated passsword:" + password);

	}


	public static String generatePassword(int length, String charSet) {
		StringBuilder password= new StringBuilder();
		Random random = new Random();
		for(int i=0;i<length;i++) {
			int randomIndex= random.nextInt(charSet.length());
			password.append(charSet.charAt(randomIndex));
		}
		return password.toString();
	}
	
	


	

}
