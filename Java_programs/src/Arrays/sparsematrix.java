package Arrays;

public class sparsematrix {
public static void main(String[] args) {
	int arr[][]= {{0, 0, 3},{0, 5, 0},{6, 0, 0}};
	int a = arr.length;
	int b= arr[0].length;
	int totalarray = a*b;
	int count =0;
	for(int i=0;i<a;i++) {
		for(int j=0;j<b;j++) {
			if(arr[i][j]==0) {
				count++;
			}
		}
	}
	if(count>totalarray/2) {
		System.out.println("sparsematrix");
	}
	else {
		System.out.println("Not sparsematrix");
	}
}
}
