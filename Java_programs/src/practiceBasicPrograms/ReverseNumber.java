package practiceBasicPrograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = scanner.nextInt();
    
    int reversedNumber = 0;
    int temp = n; 
    
    while (temp != 0) {
        int digit = temp % 10;                 
        reversedNumber = reversedNumber * 10 + digit; 
        temp /= 10;                           
    }
    
    System.out.println("Reversed Number: " + reversedNumber);
}
}
