package OneDArray;

import java.util.Arrays;

public class PairsInJava {
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
	//System.out.println("sort the array ");
//	for(int i=0;i<arr.length;i++) {
//		for(int j=i+1;j<arr.length;j++) {
//			if(arr[i]>arr[j]) {
//				int temp = arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
//		}
//	}
//	for(int k=0;k<arr.length;k++) {
//		System.out.print(arr[k]+" ");
//	}
	
	int low=0;
	int high = arr.length-1;
	int target = 9;
	while(low < high) {
		if(arr[low] + arr[high] > target) {
			high--;
			
		}
		else if(arr[low] + arr[high] < target) {
			low++;
		}
		else if(arr[low] + arr[high] == target) {
			System.out.println("pair ("+arr[low]+","+arr[high]+")");
			low++;
			high--;
			
		}
		System.out.println();
	}
}
}
