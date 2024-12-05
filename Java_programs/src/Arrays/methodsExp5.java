package Arrays;

public class methodsExp5 {
 int math1(int arr[]) {
	 if(arr.length ==0)
	 return 0;
	 else if(arr.length == 1)
		 return arr[0];
	 else 
		 return arr[0]+arr[1];
	 
 }
	public static void main(String[] args) {
		methodsExp5 obj =new methodsExp5();
		    int array[] = {30};
            int a = obj.math1(array);
            System.out.println(a);
	}

}
