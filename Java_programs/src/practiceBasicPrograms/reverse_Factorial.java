package practiceBasicPrograms;

//public class reverse_Factorial {
import java.util.Scanner;

public class reverse_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to find its reverse factorial: ");
        long num = sc.nextLong();  // Reading the number

        // Find reverse factorial using a for loop
        int result = findReverseFactorial(num);

        if (result == -1) {
            System.out.println("The given number is not a factorial of any integer.");
        } else {
            System.out.println("The reverse factorial of " + num + " is " + result);
        }

        // Close the scanner
        sc.close();
    }

    public static int findReverseFactorial(long num) {
        long factorial = 1;  // Initial factorial value (0! = 1)
        
        // Loop to find the reverse factorial
        for (int i = 1; factorial < num; i++) {
            factorial *= i;  // Multiply factorial by i (i.e., i!)
            
            if (factorial == num) {
                return i;  // If factorial matches the input number, return i
            }
        }
        
        // If no match is found, return -1
        return -1;
    }
}

