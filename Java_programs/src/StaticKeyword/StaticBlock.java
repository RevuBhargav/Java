package StaticKeyword;

public class StaticBlock {
	final static int x;
	static {
		x=50;
		System.out.println("1st Static Block : "+x);
	}

	public static void main(String[] args) {
		System.out.println("main method");
	}
		static {
			System.out.println("2nd Static Block : "+x);
		}

	}


