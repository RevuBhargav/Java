package Strings;

import java.util.Scanner;

public class ReversedAString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Name of the String : ");
	String str = sc.nextLine();
	System.out.println("your name is : ");
	System.out.println(str);
	String reversed ="";
	for(int i=str.length()-1;i>=0;i--) {
		reversed +=str.charAt(i);
	}
	System.out.println("reversed String is : "+reversed);
	
}
}
