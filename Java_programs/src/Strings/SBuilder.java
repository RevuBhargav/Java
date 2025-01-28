package Strings;

public class SBuilder {
public static void main(String[] args) {
	StringBuilder sb1 =new StringBuilder("Bhargav");
	StringBuilder sb2=new StringBuilder("Bhargav");
	System.out.println(sb1==sb2);
	sb1=sb1.append("revu");
	System.out.println(sb1==sb2);
	StringBuilder sb3=new StringBuilder("Bhargavrevu");
	System.out.println(sb3==sb1);
}
}
