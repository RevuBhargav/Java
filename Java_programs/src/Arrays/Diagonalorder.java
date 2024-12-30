package Arrays;

import java.util.Scanner;

public class Diagonalorder {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows: ");
	int rows = sc.nextInt();
	System.out.println("Enter the number of colums: ");
	int cols = sc.nextInt();
	int [][] arr = new int [rows][cols];
	System.out.println("Enter the elements ");
	for(int i=0;i<rows;i++) {
		for(int j =0;j<cols;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<rows;i++) {
		for(int j =0;j<cols;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("diognalord matrix----------------");
	 for (int col = 0; col < rows; col++) {
         int i = 0, j = col;
         while (i < cols && j >= 0) {
             System.out.print("["+arr[i][j]+"]");
             i++;
             j--;
         }
         System.out.println();
	 }
	 for(int row =1;row<cols;row++) {
		 int i=row,j=cols-1;
		 while (i < cols && j >= 0) {
             System.out.print("["+arr[i][j]+"]");
             i++;
             j--;
         }
         System.out.println();
	 }
//         for(int k=0;k<rows-1;k++) {
//        	int i=k,j=0;
//        	while(i>=0) {
//        		System.out.print(arr[i][j]+" ");
//        		i=i-1;
//        		j=j+1;
//        	}
//        	System.out.println();
//         }
//         for(int k=1;k<cols-1;k++) {
//         	int i=rows-1,j=k;
//         	while(j<=cols-1) {
//         		System.out.print(arr[i][j]+" ");
//         		i=i-1;
//         		j=j+1;
//         	}
//         	System.out.println();
//          }
	
} 
}
