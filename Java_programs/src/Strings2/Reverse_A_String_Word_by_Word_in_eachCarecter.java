package Strings2;

import java.util.Scanner;

public class Reverse_A_String_Word_by_Word_in_eachCarecter {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a String name");
	String s = sc.nextLine();
	System.out.println(s);
	System.out.println();
	String words[] =s.split(" ");
	String ouputstring ="";
	for (int i = 0; i < words.length; i++) {
		String word = words[i];
		String reverse ="";
		for(int j= word.length()-1;j>=0;j--) {
			reverse += word.charAt(j);
		}
		if(i!= words.length-1)
		ouputstring += reverse +" ";
		else {
			ouputstring += reverse;
		}
	}
	System.out.println(ouputstring);
}
}
