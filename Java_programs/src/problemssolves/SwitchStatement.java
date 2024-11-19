package problemssolves;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a day of 1 to 7 : ");
		int x = sc.nextInt();
		switch(x) {
		case 1:
			System.out.println("monday");
			break;
			
		case 2:
			System.out.println("thuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday"); 
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default :
			System.out.println("invalid day");
		}
		
		

	}

	
}
