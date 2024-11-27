package problemssolves;

import java.util.Scanner;

public class MarketSwitch {
      void math1() {
    	  int kg;
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Welcome to our vegetable store");
    	  System.out.println("please choose : ");
    	  System.out.println("Onians");
    	  System.out.println("chillis");
    	  System.out.println("Tomatos");
    	  System.out.println("Bringals");
    	  System.out.println("lady Fingers");
    	  String s =sc.nextLine();
    	  
    	  switch(s){
    	  case "onians" :
    		  System.out.println("1kg of onians is 30");
    		  System.out.println("How many kgs you need ?");
    		  int a = sc.nextInt();
    		  System.out.println(a+"kgs of onians cost is : "+(30*a));
    		  break;
    	  case "chillis" :
    		  System.out.println("1kg of chillis is 60");
    		  System.out.println("How many kgs you need ?");
    		  int kg1 = sc.nextInt();
    		  System.out.println(kg1+"kgs of onians cost is : "+(60*kg1));
    		  break;
    	  case "Tomato" :
    		  System.out.println("1kg of tomotos is 50");
    		  System.out.println("How many kgs you need ?");
    		  int kg2 = sc.nextInt();
    		  System.out.println(kg2+"kgs of onians cost is : "+(50*kg2));
    		  break;
    	  case "Brinjals" :
    		  System.out.println("1kg of Brinjals is 55");
    		  System.out.println("How many kgs you need ?");
    		  int kg3 = sc.nextInt();
    		  System.out.println(kg3+"kgs of onians cost is : "+(55*kg3));
    		  break;
    	  case "lady Fingars" :
    		  System.out.println("1kg of lady Fingars is 40");
    		  System.out.println("How many kgs you need ?");
    		  int kg4 = sc.nextInt();
    		  System.out.println(kg4+"kgs of onians cost is : "+(40*kg4));
    		  break;
    	default:
    		System.out.println("invalid input");
    		break;
    		  
    	  }
      }
	public static void main(String[] args) {
		new MarketSwitch().math1();

	}

}
