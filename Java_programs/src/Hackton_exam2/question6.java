package Hackton_exam2;

import java.util.Scanner;

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] negative = new int[n];
        int[] positive = new int[n];
        int negCount = 0, posCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                negative[negCount++] = arr[i];  
            } else {
                positive[posCount++] = arr[i];  
            }
        }
        int index = 0;
        for (int i = 0; i < negCount; i++) {
            arr[index++] = negative[i];
        }
        for (int i = 0; i < posCount; i++) {
            arr[index++] = positive[i];
        }
        System.out.print("Rearranged Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

