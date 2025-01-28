package Strings2;

import java.util.Scanner;

public class Remove_the_spaces_byusing_trim {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a String name");
	String s = sc.nextLine();
	System.out.println(s);
	System.out.println("trim :"+s.trim());
}
}
