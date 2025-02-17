package Abstarct;

public class Abstact_class2 extends Abstact_class {
	@Override
	void math1() {
		System.out.println("abstract method overridden");
	}
	public static void main(String[] args) {
		Abstact_class obj = new Abstact_class2();
		obj.math1();//method overriding
		obj.math2();
	}

}
