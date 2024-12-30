package Arrays;

public class methodsExp6 {
boolean math1(int[] num) {
	if(num[0]==6 || num[2]==6)
		return true;
	return false;
				
}
public static void main(String[] args) {
	methodsExp6 obj = new methodsExp6();
	int input[]= {7,20,6};
	boolean b=obj.math1(input);
	System.out.println(b);
}
}
