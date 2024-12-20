package Arrays;

import java.util.Arrays;

public class RemovingDuplicateArray {
public static void main(String[] args) {
	int arr[]= {1,5,2,1,4,3,5,6};
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
	System.out.println();
	
	int len = arr.length-1;
	int j = 1; 
	Arrays.sort(arr);
	
	for(int i=0;i<len;i++)
	{
		if(arr[i]!=arr[i+1]) {
			arr[j]=arr[i+1];
			j++;
		}
	}
	System.out.println("count : "+j);
	for(int k=0;k<j;k++) {
		System.out.print(arr[k]+" ");
	}
}
}
