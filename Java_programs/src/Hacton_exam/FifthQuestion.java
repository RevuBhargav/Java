package Hacton_exam;


	import java.util.Scanner;

	public class FifthQuestion {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input: Size of the matrix (N x N)
	        System.out.print("Enter the size of the matrix (N): ");
	        int N = scanner.nextInt();

	        // Input: Elements to fill the matrix
	        int[] elements = new int[N * N];
	        System.out.println("Enter " + (N * N) + " elements:");
	        for (int i = 0; i < N * N; i++) {
	            elements[i] = scanner.nextInt();
	        }

	        // Create and fill the matrix in spiral order
	        int[][] matrix = new int[N][N];
	        fillSpiralMatrix(matrix, elements, N);

	        // Output the matrix
	        System.out.println("Spiral Matrix:");
	        printMatrix(matrix);

	        scanner.close();
	    }

	    // Function to fill the matrix in spiral order
	    public static void fillSpiralMatrix(int[][] matrix, int[] elements, int N) {
	        int top = 0, bottom = N - 1, left = 0, right = N - 1;
	        int index = 0; // To track elements array

	        while (top <= bottom && left <= right) {
	            // Fill top row (left to right)
	            for (int i = left; i <= right; i++) {
	                matrix[top][i] = elements[index++];
	            }
	            top++; // Move top boundary down

	            // Fill right column (top to bottom)
	            for (int i = top; i <= bottom; i++) {
	                matrix[i][right] = elements[index++];
	            }
	            right--; // Move right boundary left

	            // Fill bottom row (right to left)
	            if (top <= bottom) {
	                for (int i = right; i >= left; i--) {
	                    matrix[bottom][i] = elements[index++];
	                }
	                bottom--; // Move bottom boundary up
	            }

	            // Fill left column (bottom to top)
	            if (left <= right) {
	                for (int i = bottom; i >= top; i--) {
	                    matrix[i][left] = elements[index++];
	                }
	                left++; // Move left boundary right
	            }
	        }
	    }

	    // Function to print the matrix
	    public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int element : row) {
	                System.out.print(element + " ");
	            }
	            System.out.println();
	        }
	    }
	}


