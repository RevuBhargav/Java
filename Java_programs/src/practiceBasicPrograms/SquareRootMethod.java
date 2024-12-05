package practiceBasicPrograms;

import java.util.Scanner;

// formula : sqrtn+1=(sqrtn+(num/sqrtn))/2.0
public class SquareRootMethod {
	public static void main(String[] args)    
	{   
	System.out.print("Enter a number: ");  
	  
	Scanner sc = new Scanner(System.in);  
	  
	int n = sc.nextInt();  
	  
	System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
	}  
	
	public static double squareRoot(int num)   
	{  
	 
	double t;  
	double sqrtroot=num/2;  
	do   
	{  
	t=sqrtroot;  
	sqrtroot=(t+(num/t))/2;  
	}   
	while((t-sqrtroot)!= 0);  
	return sqrtroot;  
	}  
}
