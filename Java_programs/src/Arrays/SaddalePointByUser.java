package Arrays;

import java.util.Scanner;

public class SaddalePointByUser {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no of Rows : ");
	int n = sc.nextInt();
	System.out.println("enter no of Colums : ");
	int m = sc.nextInt();
	int arr[][]=new int[n][m];
	System.out.println("plese enter the numbers : ");
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
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
		boolean	result = saddlePoint(arr,i,j,n,m);
			if(result) {
				System.out.println("Saddle point of given matrix is : "+arr[i][j]+"["+i+","+j+"]");
				
			}
		 }
		
	}
}

private static boolean saddlePoint(int[][] arr, int i, int j, int n, int m) {
  boolean minFlag = true;
  boolean maxFlag = true;
	for(int x=0;x<m;x++) {
		if(arr[i][x]<arr[i][j]) {
			minFlag=false;
			break;
		}
	}
	
	for(int y=0;y<n;y++) {
		if(arr[y][j]>arr[i][j]) {
			maxFlag=false;
			break;
		}
	}
	
	if(minFlag==true && maxFlag==true) {
		return true;
	}
	else {
		return false;
	}
}
}
