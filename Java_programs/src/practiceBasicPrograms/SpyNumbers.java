package practiceBasicPrograms;

import java.util.Scanner;

public class SpyNumbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a spy number");
	int n = sc.nextInt();
	int sum=0;
	int product = 1;
	while(n>0) {
		int digit = n%10;
		 sum = sum + digit;
		 product = product * digit;
		 n=n/10;
	}
		 if(sum==product) {
			 System.out.println("given num is spy number");
		 }
		 else {
			 System.out.println("given num is not a spy number");
		 }
	
}
}
