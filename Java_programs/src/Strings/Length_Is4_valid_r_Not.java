package Strings;

import java.util.Scanner;

public class Length_Is4_valid_r_Not {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the String name :");
	String s = sc.nextLine();
	
	if(s.length()==4) {
		System.out.println("valid ");
	}
	else {
		System.out.println("Not valid");
	}
}
}
