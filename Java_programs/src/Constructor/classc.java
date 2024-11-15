package Constructor;

public class classc {

void math2() {
	System.out.println("hello");
}
classc(){
	System.out.println("luckey");
}
classc(int a){
	System.out.println(a);
}
	public static void main(String[] args) {
		classc obj = new classc(100);
		new classd("java is awesome ");
		obj.math2();
		
	}

}
