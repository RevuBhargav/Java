package ThisKeyword;

public class ThisStatic {
      void math1() {
    	  System.out.println("hi");
    	  math2();
      }
       void math2() {
    	  System.out.println("hello");
    	  this.math3();
    	  //We can call "this" keyword in inside method only we cannot access inside "static" methods. 
    	  
      }
      static void math3() {
    	  System.out.println("how r u ");
    	  
      }
	public static void main(String[] args) {
		new ThisStatic().math1();

	}

}
