 package OneDArray;

import java.util.Arrays;

public class ReverseArrayByShorting {
public static void main(String[] args) {
	int arr[]= {1,6,3,2,4,5};
//	for(int i=0;i<arr.length;i++) {
//		System.out.print(arr[i]+" ");
//	}
	for(int a : arr) {
		System.out.print(a+" ");
	}
	System.out.println();
	 Arrays.sort(arr); 
	 for(int i:arr) {
		 System.out.print(i+" ");
	 }
//	 for(int i=0;i<arr.length;i++) {
//		 for(int j=i+1;j<arr.length;j++) {
//			 int temp = arr[i];
//			 arr[i]=arr[j];
//			 arr[j] = temp;
//		 }
//		
		
	// }
	 System.out.println();
	 for(int k=arr.length;k>0;k--) {
		 
	 
	 
	 System.out.print(k+" ");
	 } 
}
}
