package Arrays;

public class SaddelepointofMatrix {
public static void main(String[] args) {
	int arr[][]= {{11,10,20,40},{21,31,41,51},{22,32,33,34},{52,35,56,50}};
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
