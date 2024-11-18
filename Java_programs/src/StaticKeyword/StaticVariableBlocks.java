package StaticKeyword;

public class StaticVariableBlocks {
         static int x=StaticVariableBlocks.math1();
         static int math1() {
        	 System.out.println("math1 called");
        	 System.out.println(x);
        	 return 100;
         }
         
	public static void main(String[] args) {
		System.out.println("main method");

	}
	static {
		System.out.println("1st Static block "+x);
	}

}
