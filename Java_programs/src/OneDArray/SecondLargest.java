package OneDArray;

public class SecondLargest {
public static void main(String[] args) {
	int arr[]= {1,2,3,5,2};
	int n=5;
	int largest = 1;
	for(int i=0;i<n;i++) {
		
		if(arr[i]>largest) {
			largest = arr[i];
		}
		
	}
	int secondlargest=-1;
	for(int i =0;i<n;i++) {
		if(arr[i]> secondlargest && arr[i]!= secondlargest) {
			secondlargest =arr[i];
		}
	}
	System.out.println("secondlargest : "+secondlargest);
}
}
