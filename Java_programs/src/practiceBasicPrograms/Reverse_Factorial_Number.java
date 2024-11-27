package practiceBasicPrograms;

//public class Reverse_Factorial_Number {
//public static void main(String[] args) {
	
import java.util.Scanner;

public class Reverse_Factorial_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its reverse factorial: ");
        long num = sc.nextLong();  
        long factorial = 1;  
        
        for (int i = 1; factorial < num; i++) {
            factorial *= i;  
            
            if (factorial == num) {
                System.out.println("The reverse factorial of " + num + " is " + i);
                return;
                
            }
        
        }
        System.out.println("The given number is not a factorial of any integer.");
        
        sc.close();  
    }
}

