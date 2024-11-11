package Variables;
class Student {

	// These are instance variables
	// these are declared inside the 
	// class but outside the method body
	String name;
	int rollno;
}


public class StudentRecords {
	public static void main(String args[]) {

      	// Creating Student class object
    	Student obj = new Student();

       // Assigning values in the variables
    	obj.name = "Ram";
    	obj.rollno = 10;

      	// Printing name and rollno
    	System.out.println(obj.name);
    	System.out.println(obj.rollno);
	}
}