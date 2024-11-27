package Paterns;

public class pattern5 {

	public static void main(String[] args) {
		int n=5;
		int num =1;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++ ) {
				System.out.print("* ");
				num++;
			}
			System.out.println();
		}

	}

}
