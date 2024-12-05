package Arrays;

public class methodsExp2 {
     int[] math1() {
    	 int arr[]= {2,2,3};
    	 for(int i=0;i<3;i++) {
    		 if((arr[i]==0) && arr[i+1]==0) {
    			 arr[i+1]=0;
    		 }
    	 }
    	 
    	 return arr;
     }
     public static void main(String[] args) {
    	 methodsExp2 obj = new methodsExp2();
    	 int result[]=obj.math1();
    	 for(int x:result) {
    		 System.out.print(result+" ");
    	 }
	}
     
}
