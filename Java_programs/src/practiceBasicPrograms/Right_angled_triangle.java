package practiceBasicPrograms;
import java.util.Scanner;
public class Right_angled_triangle {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user for the number of rows in the triangle
	        System.out.print("Enter the number of rows for the triangle: ");
	        int rows = scanner.nextInt();

	        // Loop to print each row of the triangle
	        for (int i = 1; i <= rows; i++) {
	            // Inner loop to print '*' in each row
	            for (int j = 1; j<= i; j++) {
	                System.out.print(" ");
	            }
	            // Move to the next line after each row
	            System.out.println("");
	        }

	        scanner.close();
	    }
	}


