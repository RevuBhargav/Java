package Hackton3;

import java.util.Scanner;

public class Question2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String : ");
	String s =sc.nextLine();
	if(s.length()=='a' && s.length()=='z') {
	System.out.println(s.contains(s));
	}
}
}
