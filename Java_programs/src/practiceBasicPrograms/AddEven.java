package practiceBasicPrograms;

import java.util.Scanner;

public class AddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("given num is even : "+a);
		}
		else {
			System.out.println("given num is add"+a);
		}
	}

}
