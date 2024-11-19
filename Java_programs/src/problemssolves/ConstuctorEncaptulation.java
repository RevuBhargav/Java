package problemssolves;

import java.util.Scanner;

public class ConstuctorEncaptulation {
	String name;
	int rollNumber;
	float marks;
	ConstuctorEncaptulation(String name,int rollNumber,float marks){
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
		
		
	}
	

	public String getName() {
		return name;
	}
public int getRollNumber() {
		return rollNumber;
	}
public float getMarks() {
		return marks;
	}
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a name : ");
		String s = sc.nextLine();
		System.out.println("Enter rollnumber : ");
		int n = sc.nextInt();
		System.out.println("enter a marks : ");
		float f = sc.nextFloat();
		
		ConstuctorEncaptulation obj = new ConstuctorEncaptulation( s,n,f);
		System.out.println("student details :");
		System.out.println("Name : "+obj.getName());
		System.out.println("rollNumber : "+obj.getRollNumber() );
		System.out.println("marks : "+obj.getMarks());

	}

}
