package javaPrograms;

import java.util.Scanner;

public class StudentDetails1 {
    void object() {
    	Scanner sc = new Scanner(System.in);
    	StudentDetails obj = new StudentDetails();
    	System.out.println("Enter Empname : ");
    	obj.setEmpName(sc.next());
    	System.out.println(" enter Emp Id : ");
    	obj.setEmpId(sc.next());
    	System.out.println("Enter Emp Deportment : ");
    	obj.setEmpDep(sc.next());
    	System.out.println("Enter Emp Address : ");
    	obj.setEmpAdd(sc.next());
    	System.out.println("Enter Emp salary : ");
    	obj.setSalary(sc.nextFloat());
    
    	System.out.println("Emp name : "+obj.getEmpName());
    	System.out.println("Emp Id : "+obj.getEmpId());
    	System.out.println("Emp Deportment: "+obj.getEmpDep());
    	System.out.println("Emp address : "+obj.getEmpAdd());
    	System.out.println("Emp Salary : "+obj.getSalary());
    	sc.close();
    }
	public static void main(String[] args) {
		
                new StudentDetails1().object();
	}

}
