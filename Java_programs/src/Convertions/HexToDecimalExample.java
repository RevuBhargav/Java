package Convertions;

public class HexToDecimalExample {
	public static int getDecimal(String hex){  
	    String digits = "0123456789ABCDEF";  
	             hex = hex.toUpperCase();  
	             int val = 0;  
	             for (int i = 0; i < hex.length(); i++)  
	             {  
	                 char c = hex.charAt(i);  
	                 int d = digits.indexOf(c);  
	                 val = 16*val + d;  
	             }  
	             return val;  
	}  
	public static void main(String args[]){    
	System.out.println("Decimal of a is: "+getDecimal("a"));  //10
	System.out.println("Decimal of f is: "+getDecimal("f")); //15 
	System.out.println("Decimal of 121 is: "+getDecimal("121"));//289  
	}
}

/* String hex[]="";  
 * char hexchar[]={'0''1''2'' 3''4''5"6"7"8"9"A"B"C"D"E"F'}; 
 
 * 
 *  while(decimal>0)  
 
     {  
       rem=decimal%16;            //decimal to hex formula same logic on above
       hex=hexchars[rem]+hex;   
       decimal=decimal/16;  
     }  
    return hex;  */