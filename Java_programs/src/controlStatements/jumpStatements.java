package controlStatements;

public class jumpStatements {
   void math1() {
	   for(int i=1;i<=10;i++) {
		   if(i==5) {
			  // break;
			  // continue;
			   return;
		   }
		   System.out.println("math1 called : " +i);
	   }
	   System.out.println("methed close");
   }
   public static void main(String[] args) {
	new  jumpStatements().math1();
}
}
