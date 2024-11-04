package javaPrograms;

public class classA {

	public void math1() {
		System.out.println("hello");
		classA obj = new classA();
		obj.math2();
	}
	private void math2() {
		System.out.println("hi");
	}
	public static void main(String args[]) {
		
		classA obj = new classA();
		obj.math1();
		obj.math2();
		System.out.println("java is good");
	}
}
