package Inheritance_problems;

public class Savings_Account extends Bank_Account {
	 public Savings_Account(String AccountNumber, double balance) {
	        
	        super(AccountNumber, balance);
	    }
	 
	 public void withdrawal(double amount) {
		 if (getbalance() - amount < 100) {
	            System.out.println("Minimum balance of $100 required!");
	        } else {
	            super.withdrawl(amount);
	        }
	 }
 public static void main(String[] args) {
	 Bank_Account obj = new Bank_Account("bhargav", 500);
	 obj.deposit(300);
	 obj.withdrawl(200);
	 System.out.println("deposit amount :"+obj.getbalance());
	 System.out.println("withdrawal amount : "+obj.getbalance());
	 Savings_Account obj1 = new Savings_Account("raju",600);
	 obj1.deposit(200);
	 obj.withdrawl(300);
	 System.out.println("deposit amount :"+obj.getbalance());
	 System.out.println("withdrawal amount : "+obj.getbalance());
}
}
