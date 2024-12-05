package Arrays;

public class methodsExp3 {
    int[] math1() {
    	int[] arr = {2,3,4};
    	for(int i=0;i<3;i++) {
    		if((arr[i]==2) && (arr[i+1]==3)){
    			arr[i+1]=0;
    		}
    	}
    	return arr;
    }
    public static void main(String[] args) {
    	methodsExp3 obj = new methodsExp3();
    	int result[]=obj.math1();
    	for(int x:result) {
    		System.out.print(x+" ");
    	}
	}
}
