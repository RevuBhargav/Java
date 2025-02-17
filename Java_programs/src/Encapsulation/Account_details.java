package Encapsulation;
class account{
	private long accNo;
	private String name;
	private String Email;
	private int amount;
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
public class Account_details {
public static void main(String[] args) {
	account sc = new account();
	sc.setAccNo(32009777821l);
	sc.setAmount(1000000);
	sc.setEmail("bhargavrevu58@gmail.com");
	sc.setName("Bhargav");
	
	System.out.println("name :"+sc.getName());
	System.out.println("accNo : "+sc.getAccNo());
	System.out.println("Email : "+sc.getEmail());
	System.out.println("amount : "+sc.getAmount());
}
}
