package Strings;

import java.util.Scanner;

public class ToFind_A_in_Index_place {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name of the String : ");
		String a =sc.nextLine();
		int res =-1;
		while(true) {
			 res = a.indexOf('a',res+1);
			 if(res == -1) {
				 break;
			 }
			 System.out.println(res);
				
			
		}

	}

}
