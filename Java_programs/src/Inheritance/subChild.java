 package Inheritance;

public class subChild extends Child {
  int c=30;
  void show() {
	  System.out.println("sub child");
  }
  public static void main(String[] args) {
	subChild obj = new subChild();
	System.out.println(obj.c);
	obj.show();
	//Child obj1 = new Child();
	System.out.println(obj.b);
	obj.dis();
	
	System.out.println(obj.a);
	obj.display();
}
}

