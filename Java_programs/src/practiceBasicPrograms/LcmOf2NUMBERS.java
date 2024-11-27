package practiceBasicPrograms;

import java.util.Scanner;

public class LcmOf2NUMBERS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter frst number : ");
		int num1 = sc.nextInt();
		System.out.println("enter second number : ");
		int num2 = sc.nextInt();
	int lcm = findLCM(num1,num2);
	 System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
		sc.close();

	}

	private static int findLCM(int a, int b) {
	  int max = Math.max(a,b);
	  while(true) {
		  if(max%a==0 && max%b==0) {
			  return max; 
		  
	  }
		max++;
	}

}
}
