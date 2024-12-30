package Arrays;

import java.util.Scanner;

public class DuplicateElements {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a length : ");
	int n=sc.nextInt();
	System.out.println("plese enter the array : ");
	int arr[]=new int[n];
	//boolean flag = true;
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("-----------");
	for(int i=0;i<arr.length;i++) {
		System.out.print(+arr[i]+" ");
	}
	
	System.out.println();
	for(int i=0;i<arr.length;i++) {
	
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j])
				System.out.println("Duplicate values is :"+arr[i]);
				//flag=false;
			
			//else
				//System.out.println("no duplicate values");
			
				
			}
		
		
		}
	
}
}
