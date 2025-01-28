package Hackton3;

import java.util.Scanner;

public class question4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string1 ");
	String s =sc.nextLine();
	
	System.out.println("Enter a string2 ");
	String s1 =sc.nextLine();
	
	System.out.println("Enter a string3 ");
	String s3 =sc.nextLine();
	 String s4 =s.concat(s1);
	System.out.println( s.concat(s1));
	System.out.println(s4.contains(s3));
	System.out.println(s4.length());
	System.out.println(s3.length());
	
}
}
