package Paterns;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int num = 1;
		for(int i=1;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}

	}

}
