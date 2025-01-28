package Strings;

public class registationloginInStrings {
public static void main(String[] args) {
	String email = "bhargavrevu1@gmail.com";
	String phone = "8499041658";
	String password ="";
	if(!email.isEmpty()) {
		System.out.println("Email is available");
	
	if(!email.contains("@")&&!email.contains(".")) {
		System.out.println("but,Email is not a valid email");
	}
	else {
		System.out.println("email is a valid one!!..");
	}
	}else {
		System.out.println("please provided an email");
	}
	if(!phone.isEmpty()) {
		System.out.println("Email is available");
	
	if(phone.length()!=10) {
		System.out.println("but,phone number is not a valid phone");
	}
	else {
		System.out.println("phone number is a valid one!!..");
	}
	}else {
		System.out.println("please provided an mobile number");
	}
	if(!password.isEmpty()) {
		System.out.println("Email is available");
	
	if(password.length()<8 && password.length()>64) {
		System.out.println("but,password is not a valid password");
	}
	else {
		System.out.println("password is a valid one!!..");
	}
	}else {
		System.out.println("please provided an password");
	}

}
}
