package StaticKeywordMethods;

public class classC {
   static int x = 10;
   //int x=10; 
	public static void main(String[] args) {
		System.out.println(classC.x);//if you write className by using instance variable 
		                               //x=10 we getting a compile error
		//System.out.println(new classC.x);
	}
	static {
		
		int x =20;
		System.out.println(x + "");
	}

}
