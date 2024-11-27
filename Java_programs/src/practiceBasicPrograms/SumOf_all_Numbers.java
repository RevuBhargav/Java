package practiceBasicPrograms;

import java.util.Scanner;

public class SumOf_all_Numbers {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a positive integer (N): ");
        int n = scanner.nextInt();

        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

       
        System.out.println("The sum of all numbers from 1 to " + n + " is: " + sum);
    }
}
