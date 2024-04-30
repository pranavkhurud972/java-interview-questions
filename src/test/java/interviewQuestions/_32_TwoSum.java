package interviewQuestions;

import java.util.HashMap;

public class _32_TwoSum {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the console
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter the array size
//        System.out.println("Enter the size of the array:");
//        int size = scanner.nextInt();
//
//        // Create an array to store the numbers
//        int[] nums = new int[size];
//
//        // Prompt the user to enter the elements of the array
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < size; i++) {
//            nums[i] = scanner.nextInt();
//        }
//
//        // Prompt the user to enter the target value
//        System.out.println("Enter the target value:");
//        int target = scanner.nextInt();
//        
//        // Close the Scanner to avoid resource leak
//        scanner.close();

		int[] nums = { 2, 7, 11, 12 };
		int target = 9;

		// Find the indices of the two numbers that add up to the target
		int[] result = twoSum(nums, target);

		// Display the result
		System.out.println("Indices of the two numbers: " + result[0] + ", " + result[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
		// Create a hash map to store the indices of numbers
		HashMap<Integer, Integer> map = new HashMap<>();

		// Iterate through the array
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i]; //Here we can calculate the difference between target and the number like 7,2,-2,-3

			// Check if the complement exists in the map
			if (map.containsKey(complement)) {
				// Return the indices of the two numbers
				return new int[] { map.get(complement), i };
			}

			// values are added everytime there is no matching value found in complement of If block
			map.put(nums[i], i);
		}

		// If no solution is found, return an empty array
		return new int[0];
	}
}
//Code explanation: 
/*
We iterate through the array of numbers (nums).
For each number, we calculate its complement (the difference between the target and the current number).
We check if the complement exists in the hash map. If it does, we return the indices of the current number and its complement.
If the complement does not exist in the hash map, we add the current number and its index to the hash map.
If no solution is found after iterating through the array, we return an empty array.
*/