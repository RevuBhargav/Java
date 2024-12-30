package OneDArray;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;

        int maxSum = 0; // Variable to track the maximum sum
        int start = 0, end = 0; // Variables to store the start and end indices of the maximum subarray

        // Generate all subarrays
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Calculate the sum of the current subarray
                int sum = 0;
                System.out.print("Subarray: ");
                for (int k = i; k <= j; k++) {
                    sum += arr[k]; // Sum the elements of the subarray
                    System.out.print(arr[k] + " "); // Print the current element of the subarray
                }
                System.out.println("Sum: " + sum);

                // If the sum of the current subarray is greater than maxSum, update the maximum sum
                if (sum > maxSum) {
                    maxSum = sum;
                    start = i;
                    end = j;
                }
            }
        }

        // Output the maximum subarray
        System.out.println("\nMaximum Sum Subarray:");
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nMaximum Sum: " + maxSum);
    }
}

