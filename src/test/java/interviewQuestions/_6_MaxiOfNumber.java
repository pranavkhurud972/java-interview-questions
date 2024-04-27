package interviewQuestions;

import java.util.Scanner;

public class _6_MaxiOfNumber {
public static void main(String[] args) {
	
//*************************1.If Number are not given*****************************************//
	int a,b,c;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a:");
	a=in.nextInt();
	System.out.println("Enter b:");
	b=in.nextInt();
	System.out.println("Enter c:");
	c=in.nextInt();
	
	if(a>b && a>c) {
		System.out.println("a is big number");
	}
	else if(b>a && b>c) {
		System.out.println("b is big number");
	}
	else 
		System.out.println("c is big number");
	System.out.println("----------------------------------------------------------------------------------");
	
//*************************2.If Number are given*****************************************//	
	int p=100;
	int q=150;
	int m=125;
	 
	if(p>q && p>m) {
		System.out.println("p is highest number");
	}
	else if(q>p && q>m){
		System.out.println("q is highest number");
	}
	else
		System.out.println("m is highest number");
	
}
}