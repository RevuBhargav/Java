package Paterns;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
