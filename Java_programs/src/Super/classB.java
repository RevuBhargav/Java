package Super;

public class classB extends classA{
	void meth2() {
		super.meth1();
		System.out.println("Class B method");
		 
	}
	classB(){
		System.out.println("class B defualt constuctor");
	}
	
public static void main(String[] args) {
	  classB obj = new classB();
	  obj.meth2();
}
}
