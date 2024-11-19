package TypeCasting;

public class classA {
	void math1() {
		int b=20;
		byte c=(byte)b;
		System.out.println("char value :"+b);
		System.out.println("bytevalue : "+c);
		char c1 = 'z';
		int x = c1;
		char c2 = 'a';
		int y = c2;
		char c3= 'Z';
		int z = c3;
		char a ='A';
		int k = a;
		float f=b;
		
		System.out.println("char value :"+c1);
		System.out.println("int value : "+x);
		System.out.println("char value :"+c2);
		System.out.println("int value : "+y);
		System.out.println("char value :"+c3);
		System.out.println("int value : "+z);
		System.out.println("char value :"+a);
		System.out.println("int value : "+k);
		System.out.println("int value : "+f);
		
	}
	void Explicit() {
		int a = 50;
		byte c= (byte)a;
		System.out.println("int value ::"+a);
		System.out.println("byte value ::"+c);
	}

	public static void main(String[] args) {
		classA obj = new classA();
		obj.math1();
		System.out.println("######################");
		obj.Explicit();

	}

}
