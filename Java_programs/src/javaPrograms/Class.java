package javaPrograms;

public class Class {
 public int meth1(int a , int b) {
    System.out.println(a);
    Class obj = new Class();
    int x=obj.meth2(100,"java");
    System.out.println(x+1);
    System.out.println(b);
	 return a+b;
 }
 public int meth2(int a ,String b) {
	 System.out.println(a);
	 System.out.println(b);
	 return a;
 }
	public static void main(String[] args) {
		System.out.println("start");
		Class obj = new Class();
	    System.out.println(obj.meth1(10,20)+100);
	    System.out.println("End");

	}

}
