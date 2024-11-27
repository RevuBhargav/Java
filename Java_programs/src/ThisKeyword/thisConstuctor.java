package ThisKeyword;

public class thisConstuctor {
	thisConstuctor() {
	   
	   System.out.println("hi");
   }
	thisConstuctor(int a) {
		this();
		this.math3();
	   System.out.println("hello : "+a);   
   }
  static void math3() {
	   System.out.println("How R U");
   }
	public static void main(String[] args) {
		new thisConstuctor(100);
	}

}
