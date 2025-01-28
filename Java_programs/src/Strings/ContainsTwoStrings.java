package Strings;

public class ContainsTwoStrings {
public static void main(String[] args) {
	String str ="PHP Exercises and Python Exercises";
	System.out.println("Original String:"+str);
	String str1 = "and";
	System.out.println("Specified sequence of char values: "+str1);
	System.out.println(str.contains(str1));
}
}
