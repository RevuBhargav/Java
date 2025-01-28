package Strings2;

import java.util.Scanner;

public class Max_Bigword_length_of_String {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string name: ");
	String s = sc.nextLine();
	System.out.println("String name :"+s);
	String[] word =s.split(" ");
	String maxlenword = word[0];
	for (int i = 0; i < word.length; i++) {
		if(maxlenword.length() < word[i].length()) {
			maxlenword = word[i];
		}
	}
	System.out.println("maxlength :"+maxlenword);
}
}
