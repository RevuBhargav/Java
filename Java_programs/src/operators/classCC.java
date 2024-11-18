package operators;

public class classCC {

	public static void main(String[] args) {
		int a =34;
		int b=21;
		int c = a++ + ++b;
		int d = --a + --b +c--;
		int e = a+ + +b + +c + d--;
		int f = -a + b-- + -c - d++;
		int sum = a+b+c+e+d+f;
			System.out.println("sum = "+sum);
			System.out.println("f = "+f);

	}

}
