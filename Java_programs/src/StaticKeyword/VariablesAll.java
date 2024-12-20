package StaticKeyword;

public class VariablesAll {
	int a =20;
	static int c = 30;
	public void m1() {
		int b=40;
		System.out.println("method1");
		System.out.println("local variable"+b);
	}
	public void m2() {
		System.out.println("metohod2");
		System.out.println("static"+c);
		System.out.println("instance"+a);
	}
	public static void st() {
		System.out.println("ststic executed");
	}
	public static void main(String[] args) {
		VariablesAll sc= new VariablesAll();
		sc.m1();
		sc.m2();
		VariablesAll.st();
	}
}