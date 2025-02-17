package Method_overideing;

public class Accessmodifiers_IN_Overrideing2 extends Accessmodifiers_IN_Overrideing  {
	public void math() {
		System.out.println("class B mathod");
	}
public static void main(String[] args) {
	Accessmodifiers_IN_Overrideing obj = new Accessmodifiers_IN_Overrideing2();
	obj.math();
}
}
//we can access the accessmodifiers over ride in 3 public, private,protected.
// private is not inherit so you cant over ride the private accessmodifiers.