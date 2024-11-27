package practiceBasicPrograms;

import java.util.Scanner;

public class PalindromeReverseInt {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int originalNumber = scanner.nextInt();

        int reversedNumber = 0, temp = originalNumber;

        
        while (temp != 0) {
            int digit = temp % 10;        
            reversedNumber = reversedNumber * 10 + digit; 
            temp /= 10;                   
        }

        
      //  System.out.println("Reversed Number: " + reversedNumber);

        
        if (originalNumber == reversedNumber) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }

}
