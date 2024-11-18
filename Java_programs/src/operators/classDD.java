package operators;

public class classDD {
        void math1() {
        	System.out.println("Addition "+ (10+20));
        }
        void math2(int a , int b) {
        	System.out.println("substraction "+(a-b));
        }
        classDD(){
        	new classDD(100,20).math2(20,10);
        	System.out.println("multiplecation "+(10 * 20));
        	
        	
        }
        classDD(int a , int b){
        	System.out.println("Division "+(a/b)); 
        }
	public static void main(String[] args) {
		new classDD().math1();

	}

}
