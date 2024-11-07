package javaPrograms;

public class classD {
	void meth1(int a) {
		System.out.println("meth1 called");
		System.out.println("a value is : "+a);
	}
public static void main(String[] args) {
	 classD obj = new classD();
	 obj.meth1(59);
}
}
