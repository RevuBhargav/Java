package javaPrograms;

public class HassCode {
  
void math1() {
	   System.out.println("hello");
   }
	public static void main(String[] args) {
		HassCode obj1 = new HassCode();
		HassCode obj2 = new HassCode();
		System.out.println("obj1.hasscode "+obj1.hashCode());
		System.out.println("obj2.hashcode "+obj2.hashCode());
		obj1.math1();
		System.out.println("get class : "+obj1.getClass());
	}

}
