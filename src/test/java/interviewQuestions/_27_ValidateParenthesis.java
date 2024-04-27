package interviewQuestions;
import java.util.Stack;
public class _27_ValidateParenthesis {
	    public static boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();
	        
	        for (char c : s.toCharArray()) {
	            if (c == '(' || c == '[' || c == '{') {
	                stack.push(c);
	            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
	                stack.pop();
	            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
	                stack.pop();
	            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
	                stack.pop();
	            } else {
	                return false; // Invalid character or mismatched closing bracket
	            }
	        }
	        
	        return stack.isEmpty(); // Stack should be empty for a valid string
	    }

	
	
//===============================Another approach=====================================//	
//	    public static boolean isValid1(String s) {
//	        int countOpenParentheses = 0;
//	        int countOpenSquareBrackets = 0;
//	        int countOpenCurlyBraces = 0;
//	        
//	        for (char c : s.toCharArray()) {
//	            if (c == '(') {
//	                countOpenParentheses++;
//	            } else if (c == ')') {
//	                countOpenParentheses--;
//	                if (countOpenParentheses < 0) return false;
//	            } else if (c == '[') {
//	                countOpenSquareBrackets++;
//	            } else if (c == ']') {
//	                countOpenSquareBrackets--;
//	                if (countOpenSquareBrackets < 0) return false;
//	            } else if (c == '{') {
//	                countOpenCurlyBraces++;
//	            } else if (c == '}') {
//	                countOpenCurlyBraces--;
//	                if (countOpenCurlyBraces < 0) return false;
//	            } else {
//	                return false; // Invalid character
//	            }
//	        }
//	        
//	        return countOpenParentheses == 0 && countOpenSquareBrackets == 0 && countOpenCurlyBraces == 0;
//	    }

	    public static void main(String[] args) {
	        String s1 = "()";
	        String s2 = "()[]{}";
	        String s3 = "(]";
	        
	        System.out.println("Example 1: " + isValid(s1)); // Output: true
	        System.out.println("Example 2: " + isValid(s2)); // Output: true
	        System.out.println("Example 3: " + isValid(s3)); // Output: false
	    }
	}

