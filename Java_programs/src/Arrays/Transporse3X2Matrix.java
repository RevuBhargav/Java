package Arrays;

public class Transporse3X2Matrix {
public static void main(String[] args) {
	int arr[][] = {{1,2},{3,4},{5,6}};
	for(int i=0; i< arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("--------------------------------");
	int tp[][]=new int[arr[0].length][arr.length];
	for(int i=0; i< arr[0].length;i++) {
		for(int j=0;j<arr.length;j++) {
			tp[i][j]=arr[j][i];
		}
	}
	for(int a=0;a<tp.length;a++) {
		for(int b=0;b<tp[a].length;b++) {
			System.out.print(tp[a][b]+" ");
		}
		System.out.println();
	}
}
}
