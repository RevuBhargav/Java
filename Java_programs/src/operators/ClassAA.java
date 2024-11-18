package operators;

public class ClassAA {
void math1() {
	int i = 4,j = 24;
	int k = ++i *7 + 2 - j--;
	System.out.println("k = "+k);
}
	public static void main(String[] args) {
		new ClassAA().math1();

	}

}
