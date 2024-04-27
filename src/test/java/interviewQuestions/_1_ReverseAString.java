package interviewQuestions;

import java.util.Scanner;

public class _1_ReverseAString {

	public static void main(String[] args) {
//		StringBuffer a = new StringBuffer(" Pranav ");
//		System.out.println(a.reverse());
//	}
//}
//**************************** From User Input***************************************//

//	String string, rev="";
//	Scanner in=new Scanner(System.in);
//	System.out.println("Enter a string to reverse");
//	string=in.nextLine();
//	
//	int length=string.length();
//	for(int i=length-1; i>=0;i--)
//		rev= rev + string.charAt(i);
//	System.out.println(" Reverse of the entered string is:"+ rev);
//	
//	
//	}
//****************************	 Another way ******************************************//	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.nextLine();

		int length = str.length();
		String reversed = "";
		for (int i = length-1; i >= 0; i--) {
			reversed = reversed + str.charAt(i);
		}

		System.out.println("Reversed string: " + reversed);
//*************************************** Below part is used to check weather the string is palindrome or nor***************//		
		/*
		 * if (str.equalsIgnoreCase(reversed)) 
		 * { 
		 * System.out.println(str + " is a palindrome"); 
		 * } 
		 * else { 
		 * System.out.println(str + " is not a palindrome"); 
		 * }
		 */
	}

}
