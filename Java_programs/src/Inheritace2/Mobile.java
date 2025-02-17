package Inheritace2;

public class Mobile {
     public String MobileNumber;

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public void call() {
		System.out.println("Calling to "+MobileNumber);
	}
	public void message() {
		System.out.println("message has bee sent to "+MobileNumber);
	}
}
