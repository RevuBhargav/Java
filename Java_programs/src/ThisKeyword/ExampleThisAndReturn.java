package ThisKeyword;

public class ExampleThisAndReturn {
	public int math1(int a , int b) {
		System.out.println("math1called---------");
		System.out.println(a);
		return (a+b)+10+(a-b);
	}
	public int math2() {
		System.out.println("math2calles----------");
		return this.math3()+8;
	}
	
	public ExampleThisAndReturn(){
		this("java is cute");
		System.out.println(50);
	}
	public int math3() {
		System.out.println("math3called----------");
		return 10;
	}
	public String math4(int a , String s) {
		System.out.println("math4called--------");
		a=a+4;
		System.out.println(a);
		System.out.println(s);
		return s+" is object oriented program";
		
	}
	public ExampleThisAndReturn(String s) {
		String Result = this.math4(this.math1(this.math2(),5),"java");
		System.out.println(Result);
		System.out.println(s);
	}
	public static void main(String[] args) {
		new ExampleThisAndReturn();

	}

}
