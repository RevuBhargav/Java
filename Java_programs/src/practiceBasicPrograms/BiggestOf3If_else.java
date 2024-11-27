package practiceBasicPrograms;

public class BiggestOf3If_else {
	static int math1(int a, int b,int c) {
		if(a>=b&&b>=c) 
			return a;
		
		else if(b>=a&&b>=c) 
			return b;
		else
			return c;
	}
	public static void main(String[] args) {
		int a=10,b=20,c=2;
		int largest = math1(a,b,c);
		System.out.println("largest number : "+largest);

	}

}
