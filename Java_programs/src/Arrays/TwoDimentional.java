package Arrays;

public class TwoDimentional {
  void math1() {
	  int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	  for(int i=0;i<3;i++) {
		  if(i%2==0) {
		   for(int j=0;j<3;j++) {
				  System.out.print(arr[i][j]+" ");
			  }
		  }
		  else {
			   for(int j=0;j<3;j++) {
					  System.out.print(arr[i][j]+" ");
				  }
			  
		  }
			  System.out.println();
		  }
		  
		  
	  
  }
  public static void main(String[] args) {
	new  TwoDimentional().math1();
}
}
