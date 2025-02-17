package Method_overideing;
class bank {
	double display(){
		return 0;
	}
}
class ICICI extends bank{
	double display() {
		return 10.5;
	}
}
class SBI extends bank{
	double display() {
		return 12.5;
	}
}
public class Mehthod_overriding {
public static void main(String[] args) {
	ICICI sc = new ICICI();
	System.out.println(sc.display());
	SBI sc1 = new SBI();
	System.out.println(sc1.display());
}
}
