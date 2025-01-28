package Strings2;

import java.util.Scanner;

public class Count_UpperCase_LowerCase_Digits_SpecialCarecters {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a String name");
	String s = sc.nextLine();
	System.out.println(s);
	int upperCaseCount =0;
	int lowerCaseCount = 0;
	int digits =0;
	int specialcarecters =0;
	char [] characters = s.toCharArray();
	for (char ch : characters) {
		if(Character.isUpperCase(ch)) {
			upperCaseCount++;
		}
		else if(Character.isLowerCase(ch)) {
			lowerCaseCount++;
		}
		else if(Character.isDigit(ch)) {
			digits++;
			
		}
		else {
			specialcarecters++;
		}
	}
	
	System.out.println("upper case values :"+upperCaseCount);
	System.out.println("lower case values :"+lowerCaseCount);
	System.out.println("digits case values :"+digits);
	System.out.println("specialcarecters case values :"+specialcarecters);
}
}
