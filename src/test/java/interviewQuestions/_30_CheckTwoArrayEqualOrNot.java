package interviewQuestions;
import java.util.Arrays;

public class _30_CheckTwoArrayEqualOrNot {
	
	
	    public static void main(String[] args) {
	        int[] a = {1, 2, 3, 4};
	        int[] b = {2, 1, 4, 3};

	        // Check if arrays have the same elements (order doesn't matter)
	        boolean elementsEqual = Arrays.equals(sortArray(a), sortArray(b));

	        // Check if arrays have the same length
	        boolean lengthEqual = a.length == b.length;

	        // Check if both conditions are true
	        if (elementsEqual && lengthEqual) {
	            System.out.println("Arrays are equal and have the same length.");
	        } else {
	            System.out.println("Arrays are not equal or do not have the same length.");
	        }
	    }

	    // Helper method to sort an array
	    private static int[] sortArray(int[] arr) {
	        int[] sortedArray = Arrays.copyOf(arr, arr.length);
	        Arrays.sort(sortedArray);
	        return sortedArray;
	    }
	}

