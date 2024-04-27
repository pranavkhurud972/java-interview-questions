package interviewQuestions;

public class _14_LengthOfString {

	public static void main(String[] args) {
		
		System.out.println("\n---------------- 1. Find length of a string -----------------\n");
		String str="    Hello my name is pranav khurud   ";
		System.out.println("The length of str with spaces is : " + str.length()); //37
		System.out.println("The length of str w/o spaces is : " + str.trim().length()); //30
		
		System.out.println("\n---------------- 2. Find character at some specific index value -----------------\n");

		// 2. Find character at some specific index value 
		String str2 = "Hello my name is pranav khurud";
		System.out.println("Character in string str2 at ninth index value is : " + str2.charAt(9)); //n
		System.out.println(str2.length());
		//System.out.println("Character in string str2 at 48th index is : " + str2.charAt(48)); 

		System.out.println("\n---------------- 3. Find index number of a specific character in string -----------------\n");
//
		// 3. Find index number of a specific character in string
		String str3 = "Hello my name is pranav khurud";
		System.out.println(str3.length());
		System.out.println("Index number of character 'p' in String str3 is : " + str3.indexOf('p')); //17
		System.out.println("Index number of character 'a' second occurence in String str3 is : " + str3.indexOf('a', 2)); //10 not accurate
		System.out.println("Index number of character 'a' second occurence in String str3 is : " + str3.indexOf('a', str3.indexOf('a')+1)); //19 // alternate way
		System.out.println("Index number of character 'z' in string str3 is : " + str3.indexOf('z'));//-1

		System.out.println("\n----------------- 4. Find start index of a specific word in a string ----------------\n");

		// 4. Find start index of a specific word in a string
		String str4 = "Hello my name is pranav khurud";
		System.out.println("Index number for the word \"pranav\" in string str4 is : " + str4.indexOf("pranav"));//17
		System.out.println("Index number for the word \"my\" in string str4 is : " + str4.indexOf("my"));//6

		System.out.println("\n---------------  5. To convert all characters in a string into upper case ------------------\n");

		// 5. To convert all characters in a string into upper case
		String str5 = "Hello my name is pranav khurud";
		System.out.println("Converting string str5 to uppercase : " + str5.toUpperCase());


		System.out.println("\n-------------- 6. To convert all characters in a string into lower case -------------------\n");

		// 6. To convert all characters in a string into lower case
		String str6 = "SELeNIUM CAnNOt AuTOMATe DEXtOP ApPLICATiOnS";
		System.out.println("Converting string str6 to lowsercase : " + str6.toLowerCase());

		System.out.println("\n---------------- 7. To remove empty spaces present before and after from the string -----------------\n");

		// 7. To remove empty spaces present before and after from the string
		String str7 = "    Hello my name is pranav khurud   ";
		System.out.println("After removing extra spaces from before & after of String str7 output is :- " + str7.trim());
		System.out.println(str7.trim().length());
		
		System.out.println("\n---------------- 8. To remove some repeating specific character from the string -----------------\n");

		// 8. To remove some repeating specific character from the string
		String str8 = "15/11/2012"; // 15:11:2012 15#11#2012
		System.out.println("After replacing the '/' to ':' str8 becomes " + str8.replace('/', '#'));

		System.out.println("\n---------------- 9. To check a specific word available in a string [with Case sensitivity] -----------------\n");

		// 9. To check a specific word available in a string [with Case sensitivity]
		String str9 = "Selenium can handle the html code";
		System.out.println("The availibilty of word \"Selenium\" is : " + str9.contains("Selenium"));

		System.out.println("\n--------------- 10. To fetch a part from a string ------------------\n");

		// 10. To fetch a part from a string
		String str10 = "The transation number is - 45AdSJ9t";
		System.out.println("The transation number is : " + str10.substring(27));

		System.out.println("\n---------------- 11. To fetch a word from a string -----------------\n");

		// 11. To fetch a word from a string
		String str11 = "Your transaction number is - 78E354dL thank you";
		String TransationId = str11.substring(29, 37);
		System.out.println("The extracted id from str11 is : " + TransationId);

		System.out.println("\n---------------- 12. To compare two strings -----------------\n");

		// 12. To compare two strings
		String statement1 = "Java is platform independent";
		String statement2 = "java is platform independent";
		String statement3 = "Java is platform independent";
		System.out.println("Are statement1 & statement2 having exact same content : " + statement1.equals(statement2));
		System.out.println("Are statement1 & statement3 having exact same content : " + statement1.equals(statement3));
		System.out.println("Are statement1 & statement2 having exact same content : " + statement1.equalsIgnoreCase(statement2));

		System.out.println("\n---------------- 13. Splitting the String on basis of some specific char -----------------\n");

		// 13. Splitting the String on basis of some specific char
		String str13 = "Java is based on Object Oeriented Programming Principles";
		String[] words = str13.split(" "); 
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}

		System.out.println("\n------ 14. Splitting the String on basis of some specific char & print it in reverse order(Word by word) ---------\n");

		// 14. Splitting the String on basis of some specific char & print it in reverse order(Word by word)
		String stm = "Good Bye";
		String revWord[] = stm.split(" ");
		System.out.println(revWord[1]+" "+revWord[0]); // O/P - "Bye Good"
		
	}

}
