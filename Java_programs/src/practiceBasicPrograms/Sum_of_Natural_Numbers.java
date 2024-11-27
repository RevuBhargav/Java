package practiceBasicPrograms;

import java.util.Scanner;

public class Sum_of_Natural_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int sum=0;
		if(n<=0) {
			System.out.println("please enter number");
		}
		else {
			for(int i=1;i<=n;i++) {
			sum+=i;
			
		}
			System.out.println("sum of first "+n+" natural number is "+sum);
		}
	}

}
