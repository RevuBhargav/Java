package Strings2;

import java.util.Scanner;

public class Count_the_total_num_Occurcence_in_carecter_Targetvalue {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a String name");
	String s = sc.nextLine();
	System.out.println(s);
	System.out.println("target value of string is : ");
	char target = sc.next().charAt(0);
	int count =0;
//	for(int i=0;i<s.length();i++) {
//		if(s.charAt(i)==target) {
//			count++;
//		}
//	}
	char[] charecters = s.toCharArray();
	for(int i=0;i<charecters.length;i++) {
		if(charecters[i]==target) {
			count++;
		}
	}
	
	System.out.println("input :"+count);
	
}
}




