package problemssolves;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(j==i) {
		 			System.out.print("* ");
				}
				else {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		} 

	}

}
