package Paterns;

public class Patterns1 {
	void math1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		new Patterns1().math1(5);

	}

}
