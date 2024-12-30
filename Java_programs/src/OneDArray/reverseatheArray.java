package OneDArray;

public class reverseatheArray {
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50};
	for(int a : arr) {
		System.out.print(a+" ");
	}
	System.out.println();
	System.out.println("reverse the array : ");
	for(int i = arr.length-1;i>=0;i--) {
		System.out.print(arr[i]+" ");
	}
}
}
