package Polymorphism;

public class Method_overLoading {
 void math() {
 System.out.println(10);  
}
 void math(int a) {
		   System.out.println(20);
	 }
	 void math(int a , int b) {
		   System.out.println(30);
	 }
	 void math( String s ,int a) {
		   System.out.println(40);
	 }
 void math(int a , String s) {
	   	System.out.println(50);
	 }
public static void main(String[] args) {
		 Method_overLoading obj = new Method_overLoading();
		obj.math();
		obj.math(10);
		obj.math(20, 30);
		obj.math(30, "java");
		obj.math("java", 50);
	}
	}


