package Strings;

public class StringBuffersexamples {
public static void main(String[] args) {
	StringBuffer str = new StringBuffer();
	System.out.println("str value : "+str);
	System.out.println("hashcode :"+str.hashCode());
	
	str.append(10);
	System.out.println("str value :"+str);
	System.out.println("hashcode :"+str.hashCode());
	
	str.append("hello");
	System.out.println("str value :"+str);
	System.out.println("hashcode :"+str.hashCode());
	
	str.insert(1,000);
	System.out.println("str value : "+str);
	System.out.println("hashcode :"+str.hashCode());
	
	str.delete(2,4);
	System.out.println("str value : "+str);
	System.out.println("hashcode :"+str.hashCode());
	
	str.reverse();
	System.out.println("str value : "+str);
	System.out.println("hashcode :"+str.hashCode());
	
	str.toString();
	System.out.println("str value : "+str);
	System.out.println("hashcode :"+str.hashCode());
}
}
