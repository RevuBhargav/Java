package StaticKeyword;

public class Static {
	static int count;
	int x;
	void math1() {
		count++;
		x++;
		System.out.println("static variable : "+count);
		System.out.println("instance variable : "+x);
	}

	public static void main(String[] args) {
		new Static().math1();
		new Static().math1();
		new Static().math1();
	}

}
