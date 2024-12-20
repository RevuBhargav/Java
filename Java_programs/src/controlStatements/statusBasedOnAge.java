package controlStatements;

import java.util.Scanner;

public class statusBasedOnAge {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int age = sc.nextInt();
	if(age<13) {
		System.out.println("you are child");
	}
	else if(age>13 && age<18) {
		System.out.println("you are teenager");
	}
	else if(age>18 && age<60) {
		System.out.println("you adult");
	}
	else {
		System.out.println("siniour citizen");
	}
}
}
