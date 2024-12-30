package OneDArray;



public class LargestElement {
public static void main(String[] args) {
	int arr[]= {2,3,1,4,5};
	int largest = arr[0];
	int n=5;
	for(int i=0;i<n;i++) {
		if(arr[i]>largest) {
			largest = arr[i];
		}
		
	}
	System.out.println(largest);
}
}
