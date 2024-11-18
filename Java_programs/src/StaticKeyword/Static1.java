package StaticKeyword;

public class Static1 {
	static int x;//static
	 void math1() {
		  int a; //local
		  System.out.println("hi");
		  System.out.println(x);//0
	 }

	public static void main(String[] args) {
		new Static1().math1(); 
	}

}
