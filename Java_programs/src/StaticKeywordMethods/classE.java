package StaticKeywordMethods;

public class classE {
	static int x=10;
	static int y=20;
	static {
		System.out.println("---Test11 Sb1 called---");
		System.out.println("x :"+x);
		System.out.println("y :"+y);
	}
	static void math1() {
		int x =100;
		System.out.println("Static voud is called");
		System.out.println("x :"+x);
		System.out.println("y :"+y);
	}
	

	public static void main(String[] args) {
		math1();

	}
	static {
		System.out.println("---Test11 Sb2 called---");
		System.out.println("x :"+x);
		System.out.println("y :"+y);
	}

}
