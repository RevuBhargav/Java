package javaPrograms;

public class ClassF {
	public void math1(int a) {
		System.out.println("math1 value : ");
		System.out.println("a value is : "+a);
	}
	public void math2(String s) {
		System.out.println("math2 value : ");
		System.out.println("s value is : "+s);
	}

	public static void main(String[] args) {
		ClassF obj = new ClassF();
		obj.math1(30);
		obj.math2("awesome");

	}

}
