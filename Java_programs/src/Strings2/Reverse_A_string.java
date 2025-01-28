package Strings2;

import java.util.Scanner;

public class Reverse_A_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String name");
		String s = sc.nextLine();
		System.out.println(s);
		String reverse =" ";
		for(int i=s.length()-1;i>=0;i--) {
			reverse +=s.charAt(i);
		}
		System.out.println("output:"+reverse);
	}

}
