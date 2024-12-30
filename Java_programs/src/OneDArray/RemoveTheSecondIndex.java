package OneDArray;

public class RemoveTheSecondIndex {
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50,60,33};
	int remove = 4;
	int  remove1 =6;
	int arr1[]= new int[arr.length-2];
	for(int a:arr) {
		System.out.print(a+" ");
	}
	System.out.println();
	 int i=0,j=0;
	 System.out.println(arr.length);
   while(i<arr.length) {
         if ((i+1)==remove || (i+1)==remove1) {
        	 i++;
        	 continue;
             
         }
         else {
       	 arr1[j++]=arr[i];
       	 
        }
         i++;
     }
  
     
     System.out.print("Array after removing " + remove + " : ");
     for (int a : arr1) {
         System.out.print(a + " ");
     
}
}
}
 