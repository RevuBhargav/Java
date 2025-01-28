package Hackton3;

import java.util.Scanner;

public class question5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String : ");
	String s =sc.nextLine();
	String[] words = s.split(" ");
	String reverseString ="";
	for (int i = words.length-1; i >=0 ; i--) {
		String word = words[i];
		reverseString += words.length;
		System.out.println("output :"+word);
		
	
	}
	System.out.println(s.concat(reverseString));
	
}
}
