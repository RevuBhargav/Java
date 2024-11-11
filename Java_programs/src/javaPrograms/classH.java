package javaPrograms;

public class classH {
    int math1(int a, int b) {
     System.out.println(30);
     classH obj = new classH();
     obj.math2(10, "java");
     System.out.println(a+b);
     return a;
    }
    int math2(int a ,String s) {
    	System.out.println(50);
    	System.out.println(a);
    	System.out.println(s);
    	return a+a;
    }
	public static void main(String[] args) {
		System.out.println("start");
		System.out.println(new classH().math1(10,20)+100);
         System.out.println("End");
	}

}
