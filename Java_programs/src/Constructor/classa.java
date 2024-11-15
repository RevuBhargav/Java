package Constructor;

public class classa {

	void math1() {
		System.out.println("meth1 called ");
	}
	void math2( int a) {
		System.out.println("meth2 called "+a);
	}
	classa(){
		new classa(100);
		System.out.println("non paramaized");
		new classa(200).math2(200);
	}
	classa(int a){
		System.out.println("value "+a);
	}
	public static void main(String[] args) {
		new classa().math1();
	}
}
