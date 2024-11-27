package practiceBasicPrograms;

public class SwapTwoNumbers {
	void math1(int a , int b) {
		int temp = a;
		a=b;
		b=temp;
		System.out.println("value of a is"+a
				    +"\nvalue of b is"+b);
		
	}

	public static void main(String[] args) {
		int a=10,b=20;
		new SwapTwoNumbers().math1(a, b);
	}

}
