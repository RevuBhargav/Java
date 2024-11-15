package Constructor;

public class classb {
	public classb() {
		System.out.println("sunday");
		classb obj = new classb(10);
		String s = obj.display("challange accepted");
		
	}
	public classb(int temp) {
		System.out.println("saturday");
		new classb(10,20);
		System.out.println("Monday");
		
	}
	String display(String s) {
		System.out.println("in this next stament i am String value");
		System.out.println(s);
		return s;
	}
	public classb(int data,int temp) {
		System.out.println("thuesday");
	}

	public static void main(String[] args) {
		System.out.println("Start");
		classb obj = new classb();
		System.out.println("end");

	}

}
