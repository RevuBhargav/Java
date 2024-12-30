package OneDArray;

public class AverageElementOfTheArray {
public static void main(String[] args) {
	int arr[]=new int[] {1,20,3,14,50,6,7,8,9};
	int sum = 0;
	for(int i=0;i<arr.length;i++) {
		sum =sum+arr[i];
	}
	double avg = sum/arr.length;
	System.out.println("length : "+avg);
	
}
}
