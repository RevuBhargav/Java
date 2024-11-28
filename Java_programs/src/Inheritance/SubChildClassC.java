package Inheritance;

import java.util.Scanner;

public class SubChildClassC extends ChildclassB{
    int math() {
    	System.out.println(24);
    	super.math4();
    	return 98;
    	
    }
    void math5() {
    	System.out.println("math5 called");
    	super.math1();
    	
    }
    SubChildClassC (){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("constuctor method");
		System.out.println("Enter a num : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2 * i -  1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2 * i - 1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
        
	}
    
    public static void main(String[] args) {
    	SubChildClassC xobj = new SubChildClassC();
    	xobj.math();
    	xobj.math2();
    	xobj.math1();
	}
}
