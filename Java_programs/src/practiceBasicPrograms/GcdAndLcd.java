package practiceBasicPrograms;

import java.util.Scanner;

public class GcdAndLcd {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        
        int gcd = findGCD(a, b);

        // formula: LCM * GCD = num1 * num2
        int lcm = (a * b) / gcd;

       
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

	private static int findGCD(int a, int b) {
		 while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
		return a;
	}
}
