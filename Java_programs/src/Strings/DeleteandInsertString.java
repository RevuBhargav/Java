 package Strings;

public class DeleteandInsertString {
public static void main(String[] args) {
	StringBuilder s1 = new StringBuilder("Bhargav");
	s1.insert(0, "Revu");
	System.out.println(s1);
	System.out.println("---------------");
	s1.delete(0, 4);
	System.out.println(s1);
}
}
