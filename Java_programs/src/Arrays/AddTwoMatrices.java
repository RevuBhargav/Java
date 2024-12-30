package Arrays;

import java.util.Scanner;

public class AddTwoMatrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The rows : ");
		int a = sc.nextInt();
		System.out.println("Enter The cols : ");
		int b =sc.nextInt();
		int a1[][] = new int[a][b];
		int b1[][]= new int[a][b];
		int c[][]=new int[a][b];
		System.out.println("enter the first matrix numbers");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				a1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the second matrix numbers");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				b1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				System.out.print(b1[i][j]+" ");
			}
			System.out.println();
		}
			
		
		System.out.println("adding matrix");
		for(int i=0;i<a;i++) {
			for (int j=0;j<b;j++) {
				c[i][j]=a1[i][j]+b1[i][j];
				System.out.print(c[i][j]+" ");
			}
			 System.out.println(); 
		}
            
	}

}
