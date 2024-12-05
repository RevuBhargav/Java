package Arrays;

public class methodsExp1 {
 int[] math1(int arr[]) {
	 return arr;
 }
 public static void main(String[] args) {
	methodsExp1 obj = new methodsExp1();
	int input[]= {10,10,20};
	int b[] = obj.math1(input);
	for(int x : b) {
		System.out.println(x);
	}
	
	
}
}
