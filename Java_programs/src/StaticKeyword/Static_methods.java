package StaticKeyword;
class parent{
	public static int m() {
		System.out.println("parent");
		return 0;
	}
}
class child extends parent{
	public static int m() {
		System.out.println("child");
		return 0;
	}
}
public class Static_methods {
public static void main(String[] args) {
	parent.m();
	child.m();
	child s= new child();
	s.m();
	parent s1 = new parent();
	s1.m();
	int sum = child.m();
	
	
}
}
