package OneDArray;

public class ThirdLargestNumber {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {12, 45, 7, 23, 89, 56};

        // Check if the array has at least 3 elements
        if (numbers.length < 3) {
            System.out.println("Array must have at least three elements.");
        } else {
            int firstLargest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            int thirdLargest = Integer.MIN_VALUE;

            // Traverse the array to find the first, second, and third largest numbers
            for (int num : numbers) {
                if (num > firstLargest) {
                    thirdLargest = secondLargest;
                    secondLargest = firstLargest;
                    firstLargest = num;
                } else if (num > secondLargest && num != firstLargest) {
                    thirdLargest = secondLargest;
                    secondLargest = num;
                } else if (num > thirdLargest && num != secondLargest && num != firstLargest) {
                    thirdLargest = num;
                }
            }

            // Output the third largest number
            if (thirdLargest == Integer.MIN_VALUE) {
                System.out.println("No third largest number exists.");
            } else {
                System.out.println("The third largest number is: " + thirdLargest);
            }
        }
    }
}
