package javaPrograms;

public class classG {
	public int meth1(int a) {
		System.out.println("hi");
		System.out.println(a);
		return 100+a;
		
	}

	public static void main(String[] args) {
		classG  obj=new classG();
	int	result = obj.meth1(100);
	System.out.println(result);
	}

}
