package Inheritace2;

import java.util.Scanner;

class A{
int	a;
void display() {
	System.out.println(a);
}
}
class B extends A {
	int b;
	void show() {
		System.out.println(b);
	}
}
class C extends B{
	int c;
	void print() {
		System.out.println(c);
		//return c;
	}
}
public class Multi_level_inheritance {
	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter a value");
	
       C cobj =new C();
       cobj.a = 100;
       cobj.b = 200;
       cobj.c = 300;
       cobj.display();
       cobj.show();
       cobj.print();
        
}
}
