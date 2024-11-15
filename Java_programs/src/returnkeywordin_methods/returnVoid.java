package returnkeywordin_methods;

public class returnVoid {
	
	void math1(int a) {
		System.out.println("10");
		if(a<10) {
			System.out.println("If block exacuted");
			return;
		}
		else {
			System.out.println("else block exacuted");
			return;
		}
	}
	 int meth2() {
		System.out.println("meth2 called");
		return 100;
	}
	 String math3(String s) {
		 System.out.println(s);
		 return "hi";
	 }
	 int math4(int a) {
		 System.out.println(50);
		 if(a<10) {
			 System.out.println("20");
			 return 100;
		 }else {
			 System.out.println("30");
			 return 200;
		 }
	 }
	

	public static void main(String[] args) {
		returnVoid obj = new returnVoid();
		obj.math1(20);
         System.out.println("math2 value "+obj.meth2());
         System.out.println("=====>"+obj.math3("hello"));
         System.out.println("====>"+obj.math4(20));
         System.out.println("End");

	}
}

	


