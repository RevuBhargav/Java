package Strings2;

import java.util.Scanner;

public class Count_the_Num_of_Words_by_split {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String name");
		String s = sc.nextLine();
		String word[] = s.split(" ");
		System.out.println("output : "+word.length);

	}

	

}
