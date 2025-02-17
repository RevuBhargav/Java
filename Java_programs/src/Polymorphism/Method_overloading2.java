package Polymorphism;

public class Method_overloading2 {
	public void math() {
		 System.out.println(10);  
		}
		private void math(int a) {
				   System.out.println(20);
			 }
			protected void math(int a , int b) {
				   System.out.println(30);
			 }
			 String math( String s ,int a) {
				   System.out.println(40);
				   return s;
			 }
		 void math(int a , String s) {
			   	System.out.println(50);
			 }
		 public static void main(String s) {
			System.out.println("Are you amaized !!");
		}
		 public static void main(int a) {
			System.out.println("We can overload any methods in Java");
		}
		public static void main(String[] args) {
			Method_overloading2 obj = new Method_overloading2 ();
				obj.math();
				obj.math(10);
				obj.math(20, 30);
				obj.math(30, "java");
				obj.math("java", 50);
				Method_overloading2.main("bhargav");
				Method_overloading2.main(20);
			}
		
}
