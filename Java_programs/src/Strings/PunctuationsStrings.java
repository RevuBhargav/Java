package Strings;

import java.util.Scanner;

public class PunctuationsStrings {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter a string");
	 String str = scanner.nextLine();
	 int count =0;
	 for(int i=0;i<str.length();i++) {
		 if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' || 
				 str.charAt(i) == '?' || str.charAt(i) == '-' || str.charAt(i) == '\'' || str.charAt(i) == '\"' 
				 || str.charAt(i) == ':') {
			 count++;
		 }
	 }
	 System.out.println("The number of punctuations is : "+count);
}
}
