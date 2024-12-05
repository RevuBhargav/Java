package Arrays;

public class SortingAscendingorder {
public static void main(String[] args) {
	int arr[]= {5,12,4,21,8,2,3,7,9,11};
	int sum =0;
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	for(int i =0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				sum=arr[i];
				arr[i]=arr[j];
				arr[j]= sum;
			}
		}
	}
	System.out.println();
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	
}
}
