package practiceBasicPrograms;

import java.util.Scanner;

public class Prime_Number1 {
	 public static void main(String args[]){    
		  int i=1,flag=0;  
		 // int m=0;
		  Scanner sc = new Scanner(System.in); 
		  System.out.println("enter a number");
		  int n = sc.nextInt();
		 // m=n/2;      
		 // if(n==0||n==1){  
		   //System.out.println(n+" is not prime number");      
		 // }else{  
		   //for(i=2;i<=n/2;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		    // break;      
		    //}      
		   //}      
		   if(flag==0)  {
			   System.out.println(n+" is prime number");
			   }  
		  } 
		}    
}
