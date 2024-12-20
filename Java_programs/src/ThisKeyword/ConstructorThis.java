package ThisKeyword;

public class ConstructorThis {
	ConstructorThis(){
		System.out.println(" default costructor");
	}
	ConstructorThis(int a){
		this();
		this.math1();
		System.out.println("Paramateraized construcror : "+a);
	}
	int math1() {
		System.out.println("math1 called");
		return 10;
	}
	  
   public static void main(String[] args) {
	   ConstructorThis obj = new ConstructorThis(100);
	  System.out.println( obj.math1());
	   
}
}
