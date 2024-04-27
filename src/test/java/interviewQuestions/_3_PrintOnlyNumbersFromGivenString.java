package interviewQuestions;

public class _3_PrintOnlyNumbersFromGivenString {

	public static void main(String[] args) {
	String string = "Standard Order 32456789 is created successfully for the account 789 in java";

	StringBuilder number = new StringBuilder();
	for (char c : string.toCharArray())
	{
	    if (Character.isDigit(c)) //This is for number but when we have to print only letter then we can use .isLetter(c) and no need of else if
	    {
	        number.append(c);
	    } 
	else if (number.length() > 0) 
		{
	        break;
	    }
	}
	String extractedNumber = number.toString();
	System.out.println(extractedNumber);  

}
}
