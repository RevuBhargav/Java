package TypeCasting;

public class classB {
void Implicit() {
	byte b =10;
	System.out.println("Byte value : "+b);
	short s = b;
	System.out.println("Short value : "+s);
	s++;
	int i = s++;
	System.out.println("int value of i : "+i);
	System.out.println("Short value : "+s);
	long l = i;
	System.out.println("long value is : "+(--l));
	float f=l;
	System.out.println("Float value is : "+(f+b));
	double d = (--f);
	System.out.println("Double value is : "+d);
	
     show();
	if(!(d==f)) {
		System.out.println("Equal");
	}
	else {
		System.out.println("not equal");
	}
}
     public static void main(String[] args) {
		classB obj = new classB();
		obj.Implicit();
	}
     static void show() {
    	 char c ='A';
    	 int a = ++c;
    	 System.out.println(a);
    	 classB obj = new classB();
    	 String s = obj.math1();
    	 System.out.println(s);
     }
    String math1() {
    	 String s = "Implicit casting is done by the compiler automatically";
    	 return s;
     }
}
