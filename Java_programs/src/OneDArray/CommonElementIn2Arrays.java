package OneDArray;

public class CommonElementIn2Arrays {
public static void main(String[] args) {
	 int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
     int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
     for(int a:array1) {
    	 System.out.print(a+" ");
     }
     System.out.println();
     for(int b:array2) {
    	 System.out.print(b+" ");
     }
     System.out.println();
     for(int i=0;i<array1.length;i++) {
    	 for(int j=0;j<array2.length;j++) {
    		 if(array1[i]==array2[j]) {
    			 System.out.println("common elements : "+array2[i]);
    		 }
    	 }
     }
}
}
