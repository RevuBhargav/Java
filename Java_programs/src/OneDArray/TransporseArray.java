package OneDArray;

import java.util.Scanner;

public class TransporseArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the rows");
	int rows = sc.nextInt();
	System.out.println("Enter the cols ");
	int cols = sc.nextInt();
	int arr[][]=new int[rows][cols];
	for(int i =0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	for(int i =0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("transporse ------------");
	int trans[][] = new int[rows][cols];
	for(int i =0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			trans[i][j]=arr[j][i];
		}
	}
	for(int k=0;k<rows;k++) {
		for(int l=0;l<cols;l++) {
			System.out.print(trans[k][l]+" ");
		}
		System.out.println();
	}
}
}
