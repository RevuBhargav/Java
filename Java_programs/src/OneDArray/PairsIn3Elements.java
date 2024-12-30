package OneDArray;

import java.util.Arrays;

public class PairsIn3Elements {
 public static void main(String[] args) {
	 int arr[]= {1,3,5,4,2,9,7,6,8};
		System.out.println("lenth : "+arr.length);
		for(int b : arr) {
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("sort the array ");
		Arrays.sort(arr);
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();

 int target = 12;
 for(int i=0;i<arr.length;i++) {
	 for(int j=i+1;j<arr.length;j++) {
		 for(int k=j+1;k<arr.length;k++) {
			 if(arr[i]+arr[j]+arr[k] == target) {
				 System.out.println("pair ("+arr[i]+","+arr[j]+","+arr[k]+")");
			 }
		 }
	 }
 }
         
}
}
