package OneDArray;

import java.util.Arrays;


public class Merge2ArraysINsingleArray {


public static void main(String[] args) {
	int[] array1= {1,4,3,6,7};
	int array2[]= {2,5,8,9,10};
	for(int a:array1) {
		System.out.print(a+" ");
	}
	System.out.println();
	for(int b:array2) {
		System.out.print(b+" ");
	}
	System.out.println();
	Arrays.sort(array1);
	
	Arrays.sort(array2);
	 System.out.print("Sorted Array1: ");
     for (int a : array1) {
         System.out.print(a + " ");
     }
     System.out.println();

     System.out.print("Sorted Array2: ");
     for (int b : array2) {
         System.out.print(b + " ");
     }
     System.out.println();
	
	
	int[] merge = new int[array1.length + array2.length];
	for(int i=0;i<array1.length;i++) {
		merge[i]=array1[i];
	}
	for (int i = 0; i < array2.length; i++) {
        merge[array1.length + i] = array2[i];
    }
	for(int c: merge) {
		System.out.print(c+" ");
	}
	Arrays.sort(merge);
	
}
}
