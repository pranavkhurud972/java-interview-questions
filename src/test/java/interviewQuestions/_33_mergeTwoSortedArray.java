package interviewQuestions;

public class _33_mergeTwoSortedArray {
	public static void main(String[] args) {
		int[] num1 = {1,2,3,0,0,0};
		int m = 3;
		int[] num2 = {2,5,6};
		int n= 3;
		
		merge(num1, m, num2, n);
		System.out.println("Merged sorted array:");
		for(int num : num1) {
			System.out.print(num + " ");
		}
		
		
	 }
	
	public static void merge(int[] num1, int m, int[] num2, int n) {
		int i = m -1; //pointer for num1
		int j = n-1; //pointer for num2
		int k = m + n -1; //pointer for merge arr
		
		//merge num1 and num2 from the end
		while(i>=0 && j>= 0) {
			if(num1[i] > num2[j]) {
				num1[k--] = num1[i--];
			}
			else {
				num1[k--] = num2[j--];
			}
		}
		
		//if there are remaining elements in num2, copy them to num1
		while(j>=0) {
			num1[k--] = num2[j--];
		}
			
	}
	
	

}
