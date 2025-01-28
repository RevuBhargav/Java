package Strings2;

import java.util.Iterator;
import java.util.Scanner;

public class Change_odd_Words_To_upperCase_And_Reverse_the_EvenWords {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a String name");
	String s = sc.nextLine();
	System.out.println(s);
	String[] words = s.split(" ");
	String outputstring = "";
	for (int i = 0; i < words.length; i++) {
		String word = words[i];
		if(i%2==0) {
			outputstring += word.toUpperCase();
		}
		else {
			outputstring += getReverseString(word);
		}
		if(i != word.length()-1) {
			outputstring += " ";
		}
	}
	System.out.println("output : "+outputstring);
}

private static String getReverseString(String InputString) {
	 String reverseString ="";
	 for(int j=InputString.length()-1;j>=0;j--) {
		 reverseString += InputString.charAt(j);
	 }
	return reverseString;
}
}
