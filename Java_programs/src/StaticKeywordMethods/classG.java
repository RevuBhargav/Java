package StaticKeywordMethods;

public class classG {
      static int a =0;
      int b=0;
      classG(){
    	  a++;
    	  b++;
    	  System.out.println("Static variable :"+a);
    	  System.out.println("Instance variable : "+b);
    	  System.out.println("-------------");
    }
      void display() {
    	  System.out.println("****Acceesing variable****");
    	  System.out.println(classG.a);
    	  System.out.println(a);
    	  System.out.println(new classG().a);
      }
	public static void main(String[] args) {
		new classG();
		new classG();
		new classG();
		System.out.println("#############");
		new classG().display();

	}

}
