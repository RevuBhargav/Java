package problemssolves;

import java.util.Scanner;

public class EmpDetrails {
     void math1() {
    	 String empName;
    	 long empId;
    	 double empSal;
    	 String empDept;
    	 String empAddress;
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter empName : ");
    	 String empname = sc.nextLine();
    	 System.out.println("Enter empID : ");
    	 long empID = sc.nextLong();
    	 sc.nextLine();
    	 
    	 System.out.println("Enter empSalary : ");
    	 double empsal = sc.nextDouble();
    	 sc.nextLine();
    	 
    	 System.out.println("Enter Emp Deportment");
    	 String empdept = sc.nextLine();
    	 System.out.println("Enter emp Adders");
    	 String empadd = sc.nextLine();
    	 
    	 System.out.println("Emp Name : "+empname);
    	 System.out.println("Emp ID : "+empID);
    	 System.out.println("Emp Salary : "+empsal);
    	 System.out.println("Emp Dept : "+empdept);
    	 System.out.println("Emp address : "+empadd);
     }
	public static void main(String[] args) {
		EmpDetrails obj = new EmpDetrails();
		obj.math1();
	}

}
