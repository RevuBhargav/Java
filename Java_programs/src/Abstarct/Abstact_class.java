package Abstarct;

public abstract class Abstact_class {
   abstract void math1();
   void math2() {
	   System.out.println("meth2 called ");
   }
   static void math3() {
	   System.out.println("Static method called");
   }
   Abstact_class(){
	   System.out.println("constructor called");
   }
   public static void main(String[] args) {
	System.out.println("main method");
	Abstact_class.math3();
}
}
