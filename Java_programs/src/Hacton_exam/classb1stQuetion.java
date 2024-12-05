package Hacton_exam;

import java.util.Scanner;

public class classb1stQuetion  {
	
	void math1() {
		
	}
	public static void main(String[] args) {
		classb1stQuetion obj1 =	new classb1stQuetion();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		boolean b = sc.nextBoolean();
		Firstquestion obj= new Firstquestion();
		System.out.println("Enter bookname : ");
    	obj.setBookname(sc.nextLine());
    	System.out.println("Enter autherName : ");
    	obj.setAuthor(sc.nextLine());
    	System.out.println("Enter autherName : ");
    	obj.setStatus(sc.nextBoolean());
    	
    	System.out.println("book name "+obj.getBookname());
    	System.out.println("Author name "+obj.getAuthor());
    	System.out.println("Status name "+obj.isStatus());
	}
}
