package Strings2;

import java.util.Scanner;

public class Count_the_Num_of_Carecters {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a String name");
	String s = sc.nextLine();
	int count =0;
	for(int i=0;i<s.length();i++) {
		count++;
	}
	System.out.println("count = "+count);
}
}
