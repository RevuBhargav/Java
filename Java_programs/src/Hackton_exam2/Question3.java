package Hackton_exam2;

import java.util.Scanner;

public class Question3 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            int temp = arr[i];
	            arr[i] = arr[minIndex];
	            arr[minIndex] = temp;
	        }
	        double sum = 0;
	        for (int i = 0; i < n; i++) {
	            sum += arr[i];
	        }
	        double mean = sum / n;
	        double median;
	        if (n % 2 == 1) {
	            median = arr[n / 2];
	        } else {
	            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
	        }
	        System.out.print("Sorted Array: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	        System.out.println("Mean: " + String.format("%.2f", mean));
	        System.out.println("Median: " + String.format("%.2f", median));
	    }
	}


