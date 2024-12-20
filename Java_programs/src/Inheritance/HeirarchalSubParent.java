package Inheritance;

public class HeirarchalSubParent extends HeirarchalParent{
 int c=50;
 void main1() {
	 System.out.println("sub parent");
 }
 public static void main(String[] args) {
	 HeirarchalSubParent obj = new HeirarchalSubParent();
	 System.out.println(obj.c);
	 obj.main1();
     System.out.println(obj.a);
	 obj.main();
	 HeirarchalChild obj1 = new HeirarchalChild();
	 System.out.println(obj1.b);
	 obj1.display();
	 System.out.println(obj.a);
	 obj1.main(); 
}
}
