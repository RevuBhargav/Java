package OneDArray;

public class TripletsInArray {
public static void main(String[] args) {
	int arr[]={1, 2, 3, 4, 5};
      for(int a : arr) {
    	  System.out.print(a+" ");
      }
      System.out.println();
      int b = arr.length;
      int count=0;
      for(int i=0;i<b;i++) {
    	 for(int j=i+1;j<b;j++) {
    		 for(int k=j+1;k<b;k++) {
    			 if(arr[i]+arr[j]==arr[k]) {
    				 count++;
    			 }
    		 }
    	 }
    	 
      }
      System.out.println("Number of Triplets: "+count);
      
}
}
