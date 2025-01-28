package Strings;

public class ImmutableString {
	public static void main(String[] args) {  
        String originalString = "Java";  
        System.out.println("Original string: " + originalString);  
        String modifiedString = originalString.concat(" Programming");  
        System.out.println("After modification, original string: " + originalString);  
        System.out.println("Modified string: " + modifiedString);  
        originalString.toUpperCase();  
        System.out.println("After calling toUpperCase on original string: " + originalString);  
        String upperCaseString = originalString.toUpperCase();  
        System.out.println("Original string in uppercase: " + upperCaseString);  
    }  
}
