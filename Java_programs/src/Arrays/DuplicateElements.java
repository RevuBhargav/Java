package Arrays;

public class DuplicateElements {
public static void main(String[] args) {
	int arr[]= {12,2,3,4,12,23};
	//boolean flag = true;
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	for(int i=0;i<arr.length;i++) {
	
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j])
				System.out.println("Duplicate values is :"+arr[i]);
				//flag=false;
			
			//else
				//System.out.println("no duplicate values");
			
				
			}
		
		
		}
	
}
}
