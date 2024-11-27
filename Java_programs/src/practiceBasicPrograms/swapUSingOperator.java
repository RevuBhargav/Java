package practiceBasicPrograms;

public class swapUSingOperator {
	 void math1(int a , int b) {
		 System.out.println("Before Swapping Value of a is " + a
                 + " and Value of b is " + b); 
		 a=(a+b)-(b=a);
		 System.out.println("After Swapping Value of a is " + a
                 + " and Value of b is " + b);
	 }

	public static void main(String[] args) {
		int a=10,b=22;
		new swapUSingOperator().math1(a, b);
		//System.out.println(math1(a,b));

	}

}
