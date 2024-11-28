package System.out;

import java.util.Scanner;

public class AsciiValueFromUser {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("plese enter the Character");
	char a =sc.next().charAt(0);
	int Ascii = a;
	System.out.println("Ascii value of"+a+" is "+Ascii);
}
}
