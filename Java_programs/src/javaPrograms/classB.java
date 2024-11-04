package javaPrograms;

public class classB {
	void math1() {
		int a=10;
		System.out.println("A value is"+a);//using of + is to add a string value and integer value in 
        classB obj = new classB();
        obj.math2();
        System.out.println("10000");
		
	}
	void math2() {
		int a = 99;
		System.out.println("Value of Math2");
		System.out.println("Add the value :"+(a+1));
	}

	public static void main(String[] args) {
		System.out.println("HI");
		classB obj = new classB();
		obj.math1();
		System.out.println("End");
		

	}

}
