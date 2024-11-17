package StaticKeywordMethods;

public class method {
	int x=10;
	static int y=20;
	void math1() {
		System.out.println("instance variable :"+x);
		System.out.println("Static variable : "+y);
	}
	static void math2() {
		System.out.println("instance variable :"+new method().x);
		System.out.println("Static variable : "+y);
	}

public static void main(String[] args) {
	method obj = new method();
	obj.math1();
	System.out.println("---------------");
	//method.math2();
	//obj.math2();
	math2();
	//method.math1();C.E  because instance methods cannot be called with the help of the class name;
	
}
}
