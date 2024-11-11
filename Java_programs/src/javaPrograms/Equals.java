package javaPrograms;

public class Equals {

	

	public static void main(String[] args) {
		Equals obj1 = new Equals();
		Equals obj2 = new Equals();
		System.out.println(obj1.equals(obj1));
		System.out.println(obj1.equals(obj2));
		System.out.println(obj2.equals(obj1));
		
		System.out.println("get class : "+obj1.getClass());
		System.out.println("obj1.toString : "+obj1.toString());
	}

}
