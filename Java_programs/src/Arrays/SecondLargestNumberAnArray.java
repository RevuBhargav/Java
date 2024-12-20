package Arrays;

public class SecondLargestNumberAnArray {
	public static void main(String[] args) {
		
	
int arr[]= {2,3,6,9,10,15};
  int largestnum=0,secondlnumber=0;
  for(int i=0;i<arr.length;i++) {
	  if(arr[i]>largestnum) {
		   secondlnumber = largestnum ;
		   largestnum = arr[i];
	  }
	  else if(arr[i]>secondlnumber && arr[i]!=largestnum) {
		  secondlnumber = arr[i];
	  }
	  
  }
  System.out.println("second largest num is : "+secondlnumber);
  
}
}

