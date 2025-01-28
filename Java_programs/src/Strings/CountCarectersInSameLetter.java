package Strings;

public class CountCarectersInSameLetter {
public static void main(String[] args) {
	String str = "Bhargav";
	char target = 'a';
	int count =0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==target) {
			count++;
		}
	}
	System.out.println("carecter"+" "+target+" "+"is"+" "+count+" "+"times");
}
	
}
