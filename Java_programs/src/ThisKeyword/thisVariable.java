package ThisKeyword;

public class thisVariable {
     int a =10;
     static int b=20;
     void math1() {
    	 int a=30;
    	 int b=40;
    	 System.out.println("Instance Variable : "+this.a);
    	 System.out.println("Static Variable : "+this.b);
    	 System.out.println("local variable : "+a);
    	 System.out.println("local variable : "+b);
     }
	public static void main(String[] args) {
		new thisVariable().math1();

	}

}
