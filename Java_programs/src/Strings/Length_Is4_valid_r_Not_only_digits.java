package Strings;

import java.util.Scanner;

public class Length_Is4_valid_r_Not_only_digits {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String Name :");
	String s = sc.nextLine();
	
	if(s.length()== 4) {
		int i;
		for( i=0;i<4;i++) {
			char c =s.charAt(i);
			if(!(c>='0'&& c<='9'))
				break;
		}
			
			if(i==4) {
				System.out.println("valid");
			}
			else {
				System.out.println("its a not a digits");
			}
		
	}
	else {
		System.out.println("Invalid");
	}
}
}
