package javaPrograms;

public class ClassC {
	void math1() {
		ClassC obj1 = new ClassC();
		obj1.math5();
		int a = 10;
		System.out.println(10);
		System.out.println(54+a);
				
	}
	void math2() {
		int a = 20;
		System.out.println(37-a);
	}
	void math3() {
		int a=10;
		ClassC obj2 =new ClassC();
		System.out.println(43);
		obj2.math1();
		
	}
	void math4() {
		int a = 30;
		System.out.println(38);
		
	}
	void math5() {
		int a = 40;
		System.out.println(a-20);
	}

	public static void main(String[] args) {
		System.out.println("start");
		ClassC obj =new ClassC();
		obj.math3();
		obj.math4();
		System.out.println("End");
		

	}

}
