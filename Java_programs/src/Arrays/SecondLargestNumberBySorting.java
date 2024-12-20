package Arrays;

import java.util.Arrays;

public class SecondLargestNumberBySorting {
    public static void main(String[] args) {
       
        int[] numbers = {10, 20, 30, 40, 50};
        if (numbers.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }
        Arrays.sort(numbers);
        int secondLargest = numbers[numbers.length - 2];

        System.out.println("The second largest number is: " + secondLargest);
    }
}

