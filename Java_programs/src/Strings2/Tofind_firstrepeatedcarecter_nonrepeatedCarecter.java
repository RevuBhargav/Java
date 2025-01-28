package Strings2;

import java.util.Scanner;

public class Tofind_firstrepeatedcarecter_nonrepeatedCarecter {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string name: ");
	String s = sc.nextLine();
	System.out.println("String name :"+s);
	int firstrepeatedcarecter = ' ';
	int nonrepeatedcarecter = ' ';
	for(int i=0;i<s.length();i++) {
		char tempchar = s.charAt(i);
		if(tempchar != ' ') {
			if(s.indexOf(tempchar) == s.lastIndexOf(tempchar)) {
				if( nonrepeatedcarecter == ' ') {
					 nonrepeatedcarecter = tempchar;
				}
				
				else if(firstrepeatedcarecter == ' ') {
					firstrepeatedcarecter = tempchar;
				}
				if(firstrepeatedcarecter != ' ' && nonrepeatedcarecter != ' ') {
					break;
				}
				 
			}
		}
	}
	System.out.println("firstrepeatedcarecter :"+firstrepeatedcarecter );
	System.out.println( "nonrepeatedcarecter :"+ nonrepeatedcarecter);
}
}
