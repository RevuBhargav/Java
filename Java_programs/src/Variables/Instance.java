package Variables;

public class Instance {
	int a = 10;
	void math1() {
		//int a =20;
		System.out.println(a);
		System.out.println(new Instance().a);
	}
	public static void main(String[] args) {
		new Instance().math1();
	}

}
