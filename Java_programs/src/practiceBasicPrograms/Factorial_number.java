package practiceBasicPrograms;

import java.util.Scanner;

public class Factorial_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact *=i;
		}
		System.out.println("factrial num of "+n+" is "+fact );
	}

}