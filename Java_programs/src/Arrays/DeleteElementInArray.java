package Arrays;

import java.util.Scanner;

public class DeleteElementInArray {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the size of the array
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        // Input the elements of the array
	        int[] array = new int[size];
	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	        // Input the position of the element to delete
	        System.out.print("Enter the position to delete (1-based index): ");
	        int position = scanner.nextInt();

	        // Validate the position
	        if (position < 1 || position > size) {
	            System.out.println("Invalid position!");
	        } else {
	            // Shift elements to the left to delete the element
	            for (int i = position - 1; i < size - 1; i++) {
	                array[i] = array[i + 1];
	            }

	            // Reduce the size of the array logically
	            size--;

	            // Display the updated array
	            System.out.println("Array after deletion: ");
	            for (int i = 0; i < size; i++) {
	                System.out.print(array[i] + " ");
	            }
	        }

	        scanner.close();
	    }
	}

