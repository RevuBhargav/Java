package Paterns;

import java.util.Scanner;

public class Butterfly {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num : ");
		int n = sc.nextInt();
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=i;j++)
				 System.out.print("* ");
			 for(int j=i;j<=n;j++)
				 System.out.print("  ");
			 for(int j=i;j<=n;j++)
				 System.out.print("  ");
			 for(int k=1;k<=i;k++)
				 System.out.print("* ");
			 System.out.println();
		 }
		 for(int i=1;i<=n;i++) {
			 for(int j =i;j<=n;j++) 
				 System.out.print("* ");
			 for(int j=1;j<i;j++)
				 System.out.print(" ");
			 for(int j=1;j<i;j++)
				 System.out.print("   ");
			 for(int j =i;j<=n;j++)
				 System.out.print("* ");
			 System.out.println();
		 }

	}

}
