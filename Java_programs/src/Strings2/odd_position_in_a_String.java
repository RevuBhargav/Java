package Strings2;

import java.util.Arrays;
import java.util.Scanner;

public class odd_position_in_a_String {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string name: ");
	String s = sc.nextLine();
	System.out.println("String name :"+s);
	String[] word =s.split(" ");
	String[] outArray = new String[word.length/2];
	int index =0;
	for(int i=0;i<word.length;i++) {
		if(i%2 != 0) {
			outArray[index]=word[i];
			index++;
		}
	}
	System.out.println("outArray : "+Arrays.toString(outArray));
}
}
