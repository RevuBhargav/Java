package controlStatements;

public class operator {
 void math1(int a , int b, char c) {
	 System.out.println("adding : "+(a+b));
	 System.out.println("multiple :"+(a*b));
	 System.out.println("division :"+(a/b));
	 System.out.println("substraction : "+(a-b));
 }
 public static void main(String[] args) {
	new operator().math1(5, 10, '/');
}
}
