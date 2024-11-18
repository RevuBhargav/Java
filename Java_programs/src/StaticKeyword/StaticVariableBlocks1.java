package StaticKeyword;

public class StaticVariableBlocks1 {
	
	static int x=StaticVariableBlocks.math1();
    
	static int math1() {
   	 System.out.println("math1 called");
   	 return 100;
    }
	
    static {
    	System.out.println("1st Static block "+x);
    }
    
    static String math2() {
      	 System.out.println("math2 called");
      	
      	 return "java";
       }
    
public static void main(String[] args) {
	System.out.println("main method");
}
static String data = math2();

static {
	System.out.println("2nd Static block "+data);
}
}
