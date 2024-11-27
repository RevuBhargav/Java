package practiceBasicPrograms;

import java.util.Scanner;

public class Arm_Strong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Calculate the number of digits (length)
        int temp = num;
        int n = 0;
        while (temp != 0) {
            temp /= 10;
            n++;
        }

        // Check if the number is an Armstrong number
        int sum = 0;
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, n);  // Sum of each digit raised to the power of the number of digits
            temp /= 10;
        }

        
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

       
        sc.close();
    }
}
