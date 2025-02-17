package StaticKeyword;
 class initilizer{
	 static int initialValue;
	 static {
		 initialValue = 3000;
		 System.out.println("Initialvalue is : "+initialValue);
	 }
}
public class Static_Block {
public static void main(String[] args) {
	initilizer sc = new initilizer();
	System.out.println("Before creating an instance:"+sc.initialValue);
}
}
