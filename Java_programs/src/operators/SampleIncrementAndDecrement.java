package operators;

public class SampleIncrementAndDecrement {

	void math1() {
		int a =15;
		System.out.println(a++);//15 a=16
		a++;//17
		System.out.println(a--);//17 a=16
		System.out.println(++a);
		a--;
		System.out.println(a--);
		--a;
		System.out.println(a++);
		System.out.println(--a);
		a++;
		System.out.println(a--);
		a--;
		--a;
		System.out.println(a++);
		
		System.out.println(a);

	}
	public static void main(String[] args) {
		new SampleIncrementAndDecrement().math1();
	}

}
