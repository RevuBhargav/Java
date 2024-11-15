package Constructor;

public class Programming {
      Programming() {
    	 System.out.println("I love programming ");
     }
     Programming(String s){
    	System.out.println("i love "+s);
    }
	public static void main(String[] args) {
		Programming obj = new Programming();
		new Programming("java");

	}

}
