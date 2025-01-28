package Strings;

public class CompareTwoStringsLessThenStrings {
public static void main(String[] args) {
	String str1 ="bhargav1";
	String str2 = "bhargav2";
	System.out.println("str1 : "+str1);
	System.out.println("str2 : "+str2);
	int result = str1.compareTo(str2);
	if(result <  0) {
		System.out.println(str1+" "+"less then"+" "+str2);
	}
	else if (result == 0) {
		System.out.println(str1+" "+"eqal to"+" "+str2);
	}
	else {
		System.out.println(str1+" "+"grather then"+" "+str2);
	}
}
}
