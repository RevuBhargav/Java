package Hackton3;

import java.util.Scanner;

public class question3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string1 ");
	String s =sc.nextLine();
	
	System.out.println("Enter a string2 ");
	String s1 =sc.nextLine();
	
	System.out.println("Enter a string3 ");
	String s2 =sc.nextLine();
	
	System.out.println(s.substring(4));
	System.out.println(s.replace(s1,s2));
	
	
}



}
