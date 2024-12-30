package Arrays;

public class SaddelepointofMatrix {
public static void main(String[] args) {
	int arr[][]= {{1,2,3},{5,6,7},{10,9,11}};
	for(int i=0;i<arr.length;i++) {
		int max =0;
		for(int j =1; j<arr[i].length;j++) {
			if(arr[i][max]>arr[i][j]) {
				max = j;
			}
		}
		boolean flag = true;
		for(int k=0;k<arr.length;k++) {
			if(arr[i][max]<arr[k][max]) {
				flag = false;
				break;
			}
		}
		if(flag == true) 
			System.out.println("saddele point : "+arr[i][max]);
		}
	
}
}
