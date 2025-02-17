package Method_overideing;

public class Returntype_datatypes_overRide2 extends Returntype_datatypes_overRide {
	Returntype_datatypes_overRide math() {
		System.out.println("class b method");
		return this;
	}
	
public static void main(String[] args) {
	Returntype_datatypes_overRide obj = new Returntype_datatypes_overRide();
	obj.math();
}
}
// return type datatypes ==> void + 8 primitive datatypes +classes + objects.