package Hackton_exam2;

import java.util.Scanner;

public class Question4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the rows");
	int n =sc.nextInt();
	System.out.println("enter the cols");
	int m =sc.nextInt();
	int arr[][]=new int[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
		arr[i][j]=sc.nextInt();
	}
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
		System.out.print(arr[i][j]+" ");
	}
		System.out.println();
	}
	int sum=0;
	int diagonal[]=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		diagonal[i]=arr[i][i];
	}
	for(int a:diagonal) {
		System.out.println(a+" ");
	}
	int primary = 0;
	int secondary =0;
	for(int i =0;i<arr.length;i++) {
		 primary+=arr[i][n-i-1];
		 secondary+=arr[i][i];
		}
		
		 System.out.println("Primary Diagonal Sum:"+primary);
		 System.out.println("secondary Diagonal Sum:"+secondary);
	}
}



