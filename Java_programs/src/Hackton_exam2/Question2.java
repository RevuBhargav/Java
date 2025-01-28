package Hackton_exam2;

import java.util.Scanner;

public class Question2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array (range from 1 to " + n + "): ");
	        for (int i = 0; i < n-1; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        int expectedSum = n * (n + 1) / 2;
	        int actualSum = 0;
	        for (int i = 0; i < n; i++) {
	            actualSum += arr[i];
	        }
	        int missingNumber = expectedSum - actualSum;
	        System.out.println("The missing number is: " + missingNumber);
	    }
	}


