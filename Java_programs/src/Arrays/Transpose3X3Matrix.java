package Arrays;

public class Transpose3X3Matrix {
public static void main(String[] args) {
	int arr[][]= {{1,3,4},{2,4,3},{3,4,5}};
	int trns [][]=new int[3][3];
	for(int i=0; i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("------------------");
	for(int i=0;i<arr[0].length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			trns[i][j]=arr[j][i];
		}
	}
	for(int k=0;k<trns.length;k++) {
		for(int l=0;l<trns[k].length;l++) {
			System.out.print(trns[k][l]+" ");
		}
		System.out.println();
	}
}
}
