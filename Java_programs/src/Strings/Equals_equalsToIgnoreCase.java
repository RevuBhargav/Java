package Strings;

public class Equals_equalsToIgnoreCase {
public static void main(String[] args) {
	String s= "Bhargav";
	String s1 = "bhargav";
	System.out.println(s.equals(s1));
	System.out.println(s.equalsIgnoreCase(s1));
	System.out.println();
	System.out.println(s.startsWith("Bha"));
	System.out.println(s.endsWith("v"));
}
}
