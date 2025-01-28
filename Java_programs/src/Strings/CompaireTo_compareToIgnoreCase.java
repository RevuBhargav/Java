package Strings;

public class CompaireTo_compareToIgnoreCase {
public static void main(String[] args) {
	String s= "Bhargav";
	String s1 = "bhargav";
	System.out.println(s.compareTo(s1));// -32 ascii values in frst letter to last letter added in two strings
	System.out.println(s.compareToIgnoreCase(s1));// 0  two strings are eqal either small letters r 
	                                                 //capital letters ascii values r same in the letters
}
}
