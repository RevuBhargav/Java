package ThisKeyword;

public class ReturnThis {
	 ReturnThis math1() {
		 System.out.println("hi");
		 return this;
	 }
	 ReturnThis math2() {
		 System.out.println("hello");
		 return this;
	 }
	 void math3() {
		 System.out.println("how r u");
	 }

	public static void main(String[] args) {
		new  ReturnThis().math1().math2().math3();//methods calling(by using class name and return type)
	}

}
