package problemssolves;

import java.util.Scanner;

public class classB {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        classA obj = new classA();

        System.out.println("Enter Name:");
        String myName = sc.nextLine();
        obj.setName(myName);

        System.out.println("Enter Roll Number:");
        int number = sc.nextInt();
        obj.setRollNumber(number);

        System.out.println("Enter Marks:"); 
        int marks = sc.nextInt();
        obj.setMarks(marks);

       
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + obj.getName());
        System.out.println("Roll Number: " + obj.getRollNumber());
        System.out.println("Marks: " + obj.getMarks());

        sc.close();
    }
}


