package Strings;

public class Region_Matches {
public static void main(String[] args) {
	String s = "Bhargav";
	String s1 = "bhargav";
	System.out.println(s.regionMatches(1, s1, 1, 3));
	System.out.println(s.regionMatches(0, s1, 0, 5));
	System.out.println("india".substring(2).regionMatches( 0, "india".substring(2), 0, 3));
}
}
