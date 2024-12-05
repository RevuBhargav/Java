package Hacton_exam;

public class FouththQuetions {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int temp=0;
		
		for(int i=1;i<arr.length;i++) {
			temp = arr[i];
		  arr[i] = arr[i + 1];
		 arr[i + 1] = temp;
		}
       System.out.println("output :"+arr);
	
	for(int num : arr) {
		System.out.println(num+"");
	}

}
}
