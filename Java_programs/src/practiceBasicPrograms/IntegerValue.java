package practiceBasicPrograms;

import java.util.Scanner;

public class IntegerValue {
int math1() {
	int a;;
	System.out.println("enter the integer num ");
	Scanner s = new Scanner(System.in);
	a= s.nextInt();
	System.out.println("value :"+a);
	return 0;
}
	public static void main(String[] args) {
		IntegerValue obj=new IntegerValue();
		obj.math1();
		

	}

}
