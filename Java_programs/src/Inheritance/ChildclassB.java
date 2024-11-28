package Inheritance;

import java.util.Scanner;

public class ChildclassB extends ParentclassA {
void math2() {
	System.out.println("math2 called");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int n = sc.nextInt();
	
	for(int i=1;i<n;i++) {
		for(int j=i;j<n;j++) {
			System.out.print("  ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("* ");
			
		}
		System.out.println();
	}
}
ChildclassB() {
	System.out.println("class constuctor");
	System.out.println(89);
}
public static void main(String[] args) {
	ChildclassB bobj = new ChildclassB();
	bobj.math2();
	bobj.math1();
}
}
