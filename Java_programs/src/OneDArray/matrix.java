package OneDArray;

import java.util.Scanner;

public class matrix {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the length");
	int b =sc.nextInt();
	System.out.println("enter the rows :");
	int c = sc.nextInt();
	System.out.println("Enter the cols : ");
	int d = sc.nextInt();
	int a[][]=new int[c][d];
	for(int i=0;i<c;i++) {
		for(int j=0;j<d;j++) {
			a[i][j] = sc.nextInt();
		}
	}
	
	for(int i=0;i<c;i++) {
		for(int j=0;j<d;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
}
