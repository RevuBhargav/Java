package javaPrograms;

public class classE {
	void math1(int a) {
		System.out.println("math1 value :");
		System.out.println("a value is : "+a);
	}
	public void math2(int a,String s) {
		System.out.println("Math2 called :");
		System.out.println("a value is : "+a);
		System.out.println("s value is : "+s);
	}

	public static void main(String[] args) {
		
                classE obj = new classE();
                obj.math1(28);
                obj.math2(100, "name");
	}

}
