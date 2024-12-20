package Inheritance;



public class childsClass extends singleInheritance {
	
		int b=60;
		void show() {
			System.out.println("Child class");
		}
	
	
		 public static void main(String[] args) {
			   childsClass obj = new childsClass();
			  System.out.println(obj.b);
			   obj.show();
			   System.out.println(obj.a);
			   obj.display();
		}
		 }

