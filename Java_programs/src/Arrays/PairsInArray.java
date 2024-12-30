package Arrays;

public class PairsInArray {
public static void main(String[] args) {
	 int[] array = { 4, 5, 7, 11, 9, 13, 8, 12 };
     int targetValue = 20;

     System.out.println("Input array:");
     for (int num : array) {
         System.out.print(num + " ");
     }
     System.out.println("\nTarget value: " + targetValue);

     findPairs(array, targetValue);
 }
private static void findPairs(int[] array, int targetValue) {
	
    boolean found = false;

    System.out.println("Pairs whose sum is " + targetValue + ":");
    for (int i = 0; i < array.length; i++) {
        for (int j = i + 1; j < array.length; j++) {
        	for(int k = j+1;k<array.length;k++) {
//        		System.out.println(i+" "+j+" "+k);
            if (array[i] + array[j]+array[k] == targetValue) {
                System.out.println("(" + array[i] + ", " + array[j] + ","+ array[k]+")");
                found = true;
            }
        	}
        }
       
    }

    if (!found) {
        System.out.println("No pairs found.");
    }
	
}
}
