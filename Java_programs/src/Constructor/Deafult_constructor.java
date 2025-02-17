package Constructor;

public class Deafult_constructor {
 String name;
 int age;
 public Deafult_constructor() {
	 name = "bhargav";
	 age =0;
	 
 }
 public static void main(String[] args) {
	 Deafult_constructor a =new Deafult_constructor();
	 System.out.println("name : "+a.name);
	 System.out.println("age : "+a.age);
}
}
