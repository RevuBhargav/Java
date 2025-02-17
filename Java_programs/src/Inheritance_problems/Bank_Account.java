package Inheritance_problems;

public class Bank_Account {
   private String AccountNumber;
   private double balance;
public Bank_Account (String AccountNumber , double balance) {
	   this.AccountNumber = AccountNumber;
	   this.balance = balance;
   }
   public void deposit(double amount) {
	   balance+=amount;
   }
   public void withdrawl(double amount) {
	   if(balance > amount) {
	   balance -= amount;
	   }
	   else {
		   System.out.println("insufficiant balance !!");
	   }
   }
   public double getbalance() {
	   return balance;
   }
}
