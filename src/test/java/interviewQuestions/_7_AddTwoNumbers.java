package interviewQuestions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _7_AddTwoNumbers {
	
	public static void main(String[] args) throws IOException {
//************************* 1. By using integer.sum() method **********************************//	
//		int x=33, y=35,a=-15,b=-23,sum,s;
//		sum=integer.sum(x,y);
//		//returns the sum of x and y
//		System.out.println("THe sum of x and y is:" + sum);
//		sum=integer.sum(a,b);
//		System.out.println("THe sum of a and b is:" + s);

//************************* 2. Input from Command line **********************************//		
//	InputStreamReader ir = new InputStreamReader(System.in);
//	BufferedReader in = new BufferedReader(ir);
//
//	int A, B, X;
//
//	A = Integer.parseInt(in.readLine());
//	B = Integer.parseInt(in.readLine());
//
//
//	X = A + B;
//
//	System.out.printf("The sum of two numbers is X = %dn", X);
//	
//*************************3. User Defined method  **********************************//		
	int p,q,sum;
	Scanner sc=new Scanner(System.in);
	System.out.println("----------------------------------------------------------------- ");
	System.out.println("Enter the first number: ");
	p=sc.nextInt();
	System.out.println("Enter the second number: ");
	q=sc.nextInt();
	
	sum=sum(p,q);
	System.out.println("The sum of two numbers p and q is:" + sum);
	}
	
	//method that calculates the sum
	public static int sum(int p,int q)
	{
		int sum=p+q;
				return sum;
		
	}
	
			
	

	}


