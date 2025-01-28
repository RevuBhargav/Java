package Strings;

import java.util.Scanner;

public class Length_Is4_valid_r_Not_only_digits_next_Digitinlast {
	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a String");
       String s = sc.nextLine();
       
       if(s.length() == 4) {
    	   int i;
    	   for(i=0;i<4;i++) {
    		   if(!(s.charAt(i)>='0'&& s.charAt(i)<='9' ))
    			   break;
    	   }
    	   if(i==4) {
    		   int a = Integer.parseInt(s);
    		   System.out.println("next number :"+(a+1));
    	   }
    	   else {
    		   System.out.println("Its not a digits");
    	   }
       }
       else {
    	   System.out.println("Not valid");
       }
      

	}
}
