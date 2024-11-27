package practiceBasicPrograms;

import java.util.Scanner;

public class Neon_Number {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a spy number");
	int n = sc.nextInt();
	int sum=0;
	int sqare = n*n;
	while(sqare != 0) {
		int digit = sqare%10;
		sum = sum+digit;
		sqare=sqare/10;
		
	}
	if(n==sum) {
		System.out.println("given num is neon");
	}
	else {
		System.out.println("not neon");
	}
}
}
