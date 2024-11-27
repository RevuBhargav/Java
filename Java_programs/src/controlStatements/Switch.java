package controlStatements;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first number ");
		int x= sc.nextInt();
		System.out.println("enter a second number ");
		int y= sc.nextInt();
		System.out.println("enter the operator (+,-,/,*) : ");
		char operator = sc.next().charAt(0);
		int result;
		switch(operator) {
		case '+' :
			result = x+y;
			System.out.println("adding : "+result);
			break;
		case '-' :
			result = x-y;
			System.out.println("substaction : "+result);
			break;
		case '*' :
			result = x*y;
			System.out.println("multiplecation : "+result);
			break;
		case '/'  :
			result = x/y;
			if(y%2==0) {
				System.out.println("division : "+result);
				
			}
			else {
				System.out.println("Error ");
			}
			
			break;
			default :
				System.out.println("invalid operator ");
		}
		

	}

}
