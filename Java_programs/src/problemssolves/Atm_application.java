package problemssolves;

import java.util.Scanner;

public class Atm_application {
public static void main(String[] args) {
	int balance = 10000;
	Scanner sc =new Scanner(System.in);

	while(true) {
		System.out.println("Automatted teller machine");
		System.out.println("Choose 1 for Withdrawal : ");
		System.out.println("Choose 2 for Deposit : ");
		System.out.println("Choose 3 for Check Balance : ");
		System.out.println("Choose 4 for Exit : ");
		System.out.println("Choose the operation you want perform");
		int n = sc.nextInt();
		switch(n) {
		case 1 :
			System.out.println("plese enter the withdrawal amount");
			int withdrawal = sc.nextInt();
			if(balance >= withdrawal ) {
				balance -=withdrawal;
				System.out.println("please collect u r cash");
			}
			else {
				System.out.println("insufficient balance");
			}
			System.out.println(" ");
				break;	
			
		case 2 :
			   System.out.println("Enter money to Deposited");
			   int deposit = sc.nextInt();
			   balance += deposit;
			   System.out.println("Balance : "+balance);
			   System.out.println("your money is successfully deposited");
			   System.out.println("");
			   break;
			   
		case 3 :
			System.out.println("check the balance");
			System.out.println("balance"+balance);
			System.out.println(" ");
			break;
			
		case 4 :
			System.exit(0);
			break;
		default :
			System.out.println("Invalid choice");
			System.out.println(" ");
			
		}
	}
}
}
