package Method_overideing;

public class Static_Keyword_Override2 extends  Static_Keyword_Override{
static void math() {
	System.out.println("hello");
}
	public static void main(String[] args) {
		Static_Keyword_Override obj = new Static_Keyword_Override2();
		obj.math();
			
	}

}
