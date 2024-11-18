package StaticKeyword;

public class countValue {
       int count;//0
       countValue(){
    	   count++;//1
    	   System.out.println(count);
       }
	public static void main(String[] args) {
        		
             new countValue();
             new countValue();
             new countValue();
             
	}

}
