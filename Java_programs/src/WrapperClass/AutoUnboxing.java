package WrapperClass;

public class AutoUnboxing {
void math2() {
	Integer b = new Integer(50);
	int x = b.intValue();
	System.out.println("wrapper object is : "+b);
	System.out.println("int value is : "+x);
	Boolean bval = new Boolean(true);
	boolean y = bval.booleanValue();
	System.out.println("wrapper object is : "+bval);
	System.out.println("boolean value is : "+y);
	Float f = new Float(11.999);
	float z = f.floatValue();
	System.out.println("wrapper object is : "+f);
	System.out.println("float value is : "+z);
	Short s = new Short((short)100);
	short k = s.shortValue();
	System.out.println("wrapper object is : "+s);
	System.out.println("short value is : "+k);
	Byte a = new Byte((byte)10);
	byte m = a.byteValue();
	System.out.println("wrapper object is : "+a);
	System.out.println("Byte value is : "+m);
	Character ch = new Character('a');
	char c = ch.charValue();
	System.out.println("wrapper object is : "+ch);
	System.out.println("Character value is : "+c);
}
	public static void main(String[] args) {
		new  AutoUnboxing().math2();

	}

}
