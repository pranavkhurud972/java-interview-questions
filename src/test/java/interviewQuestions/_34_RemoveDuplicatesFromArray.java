package interviewQuestions;

public class _34_RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};
		int length = removeDuplicates(nums);
		System.out.println("Length of array after removing duplicates: " + length);
		System.out.println("Array contents after removing duplictes:");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
	}
	
	
	public static int removeDuplicates(int[] nums) {
		if(nums.length==0) {
			return 0;
		}
		
		int uniqueIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=nums[uniqueIndex]) {
				uniqueIndex++;
				nums[uniqueIndex]=nums[i];
			}
		}
		return uniqueIndex+1;
	}
}
