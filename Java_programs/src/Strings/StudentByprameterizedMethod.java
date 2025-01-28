package Strings;

import java.util.Scanner;

public class StudentByprameterizedMethod {
	String s ="";
	int marks =0;
public void details(String a, int m) {	
	s=a;
	marks=m;
	System.out.println("Student name : "+s);
	System.out.println("Student marks : "+marks);
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Student name :");
	String s= sc.nextLine();
	System.out.println("Enter student marks : ");
	int marks = sc.nextInt();
	StudentByprameterizedMethod obj = new StudentByprameterizedMethod();
	obj.details(s, marks);
}
}
