package Polymorphism;

public class mainMethod_overloading {
	void main(int a) {
		System.out.println(a);
	}
	void main(String s) {
		System.out.println(s);
	}
	void main(String s1 , String s2) {
		System.out.println(s1+s2);
		
	}

	public static void main(String[] args) {
		mainMethod_overloading ov = new mainMethod_overloading();
		ov.main(10);
		ov.main("java");
		ov.main("revu", "bhargav");

	}

}
