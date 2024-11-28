package practiceBasicPrograms;

import java.util.Scanner;

public class collegeRankedStudent {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the college name");
	String n = sc.nextLine();
	
	while(true) {
		 
		System.out.println("please select one option");
		System.out.println("1st student");
		System.out.println("2nd student");
		System.out.println("3rd student");
		System.out.println("4th student");
		System.out.println("Exit");
		System.out.println("select the student");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			
			System.out.println("enter the hall ticket number");
			int s =sc.nextInt();
			System.out.println("enter the student1 rank marks");
			int marks = sc.nextInt();
			if(marks<1000) {
				System.out.println("Bhargav");
				System.out.println("1st rank");
			}
			else {
				System.out.println("invalid marks");
			}
			break;
       case 2 :
			
			System.out.println("enter the hall ticket number");
			int s1 =sc.nextInt();
			System.out.println("enter the student1 rank marks");
			int marks1 = sc.nextInt();
			if(marks1<1000) {
				System.out.println("raju");
				System.out.println("2nd rank");
			}
			else {
				System.out.println("invalid marks");
			}
			break;
       case 3 :
			
			System.out.println("enter the hall ticket number");
			int s2 =sc.nextInt();
			System.out.println("enter the student1 rank marks");
			int marks2 = sc.nextInt();
			if(marks2<1000) {
				System.out.println("ram");
				System.out.println("3rd rank");
			}
			else {
				System.out.println("invalid marks");
			}
			break;
       case 4 :
			
			System.out.println("enter the hall ticket number");
			int s3 =sc.nextInt();
			System.out.println("enter the student1 rank marks");
			int marks3 = sc.nextInt();
			if(marks3<1000) {
				System.out.println("sravs");
				System.out.println("4th rank");
			}
			else {
				System.out.println("invalid marks");
			}
			break;
       case 5 :
    	   System.exit(0);
    	   break;
		
		default : 
		     System.out.println("Enter a valid case");
		}	
		
	}
}
}
