 package Arrays;

import java.util.Scanner;

public class TransposeMatrix2x2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number of Rows : ");
        int n =sc.nextInt();
        System.out.println("Enter Number of colums : ");
        int n1 =sc.nextInt();
        int arr [][]=new int[n][n1];
        System.out.println("Enter the values : ");
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n1;j++) {
        		arr[i][j]=sc.nextInt();
        		System.out.print(arr[i][j]+" ");
        	}
//        }
//        for(int i=0;i<n;i++) {
//        	for(int j=0;j<n1;j++) {
//        		
//        	}
        	System.out.println();
        }
        System.out.println("-----------Transpose Arry-----------");
           int tranpose [][] = new int[n][n1];
           for (int i=0;i<n;i++) {
        	   for(int j=0;j<n1;j++) {
        		   tranpose[i][j]=arr[j][i];
        	   }
           }

           for(int i=0;i<n;i++) {
        	   for(int j=0;j<n1;j++) {
        		   System.out.print(tranpose[i][j]+" ");
        	   }
        	   System.out.println();
           }

}
}