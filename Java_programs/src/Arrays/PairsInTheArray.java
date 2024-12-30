package Arrays;

public class PairsInTheArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,12,7,8};
	int sum =20;
	int low=0;
	int high = arr.length-1;
	while(low < high) {
		if(arr[low]+arr[high]>sum) {
			high--;
		}
		else if (arr[low]+arr[high]<sum) {
			low++;
		}
		else if(arr[low]+arr[high]==sum) {
			System.out.println("pair ("+arr[low]+","+arr[high]+")");
			
			low++;
			high--;
		}
		
	}
	
}
}
