package StaticKeyword;

public class CountStatic {
       static int count;// 1 2 3
       CountStatic(){
    	   count++;//1 2 3
    	   System.out.println(count);
       }
	public static void main(String[] args) {
		new CountStatic();
		new CountStatic();
		new CountStatic();

	}

}
