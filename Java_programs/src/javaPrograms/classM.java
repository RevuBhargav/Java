package javaPrograms;

public class classM {
   void math1() {
	   System.out.println("hello");
   }
   protected void finalize() {
	   System.out.println("the garbage value is");
   }
	public static void main(String[] args) {
		classM obj1= new classM();
		classM obj2= new classM();
		obj1.math1();
		obj1=null;
		System.gc();

	}

}
