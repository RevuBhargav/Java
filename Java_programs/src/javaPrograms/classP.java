package javaPrograms;

import java.util.Scanner;

public class classP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		classO obj = new classO();
		System.out.println("enter a rolNumber ");
		obj.setStudentRollNumber(sc.nextInt());
		//obj.StudentRollNumber=sc.nextInt();
		System.out.println("Enter a name ");
		obj.setStudentName(sc.next());
		//obj.StudentName = sc.next();
		//System.out.println("student roll number : "+obj.StudentRollNumber);
		//System.out.println("student name : "+obj.StudentName);
		System.out.println("Stdent rollNumber : "+obj.getStudentRollNumber());
		System.out.println("Student Name : "+obj.getStudentName());
        sc.close();
	}

}
