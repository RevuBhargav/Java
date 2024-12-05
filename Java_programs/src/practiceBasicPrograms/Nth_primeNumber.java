package practiceBasicPrograms;

import java.util.Scanner;

public class Nth_primeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nth prime number");
		int n= sc.nextInt();
		int num=0,i,count=0;
		while(count<n) {
			num=num+1;
			for(i=2;i<+num;i++) {
				if(num%i==0) {
					break;
				}
			}
			if(i==num) {
				count = count+1;
			}
		}
		System.out.println(n+"th prime num is "+num);

	}

}
