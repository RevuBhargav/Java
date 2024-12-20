package ThisKeyword;

public class classA {
  classA math1() {
	  System.out.println("math1 called");
	  return this;
  }
  int math2() {
	  System.out.println("math2 called");
	  return 10;
  }
  String math3() {
	  System.out.println("math3 called");
	  return "raju";
  }
  public static void main(String[] args) {
	 classA obj = new classA();
	 obj.math1();
	System.out.println(obj.math2());
	System.out.println(obj.math3());
	
}
}
