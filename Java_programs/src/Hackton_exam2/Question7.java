package Hackton_exam2;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int maxProduct = Integer.MIN_VALUE;
        int num1 = 0, num2 = 0;
          for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int product = array[i] * array[j];
                if (product > maxProduct) {
                    maxProduct = product;
                    num1 = array[i];
                    num2 = array[j];
                }
            }
        }
         System.out.println("Pair: (" + num1 + ", " + num2 + ")");
        System.out.println("Product: " + maxProduct);
    }
}