package StaticKeywordMethods;

public class classF {
	static int x = math1();
	public static void main(String[] args) {
		System.out.println(classF.x);
	}
	static {
		System.out.println(x);
		classF.x=x+20;
	}
	static int math1() {
		classF.x=50;
		return math2();
	}
	static int math2() {
		System.out.println(classF.x);
		return 100;
	}

}
