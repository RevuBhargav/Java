package Strings;

import java.util.Scanner;

public class Student {
	String sc ="";
	int marks =0;
	Scanner sca = new Scanner(System.in);
  public void details() {
	 System.out.println("enter your name : ");
	sc = sca.nextLine();
	System.out.println("Enter marks");
	marks = sca.nextInt();
   }
   public void show() {
	   System.out.println("Student name : "+sc);
	   System.out.println("Student marks : "+marks);
   }
   public static void main(String[] args) {
	Student obj = new Student();
	obj.details();
	obj.show();
}
   }
