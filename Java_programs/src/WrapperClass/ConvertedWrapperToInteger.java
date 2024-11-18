package WrapperClass;

public class ConvertedWrapperToInteger {
	void math1() {
		int i =50;
		Integer a=Integer.valueOf(i);
		System.out.println("primitive data type : "+i);
		System.out.println("Wrappers object value of : "+a);
		Integer b = Integer.valueOf(500);
		System.out.println("Wrapper object value of : "+b);
		Integer c = Integer.valueOf("200");
		System.out.println("Wrapper object value of c : "+c);
		Character ch = Character.valueOf('j');
		System.out.println("carecter value is : "+ch);
	}

	public static void main(String[] args) {
		new ConvertedWrapperToInteger().math1();

	}

}
