package Arrays;

public class methodsExp4 {
boolean math1(int arr[]) {
	if(arr[0]!=2 && arr[0]!=3 && arr[1]!=2 && arr[1]!=3) 
	return true;
	return false;
}
public static void main(String[] args) {
	methodsExp4 obj = new methodsExp4();
	int a[]= {34,5};
	boolean b= obj.math1(a);
	System.out.println(b);
}
}
