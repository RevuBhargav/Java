package Variables;

public class Static {
	static int a = 10;
	void math1() {
		int b = 10;
		System.out.println("local variable "+b);
		System.out.println("Static Variable by using Identifier :"+a);
		System.out.println("Static variable by using className :"+Static.a);
		System.out.println("static variable by using object/interface : "+new Static().a);
		
	}
	public static void main(String[] args) {
		new Static().math1();
	}
}
