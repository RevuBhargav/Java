package Hacton_exam;

import java.util.Scanner;

public class thirdQuestion {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++) {
	if((i%3!=0) || (i%5!=0)) {
		sum +=i;
		
	}
	
	
}
	System.out.println(sum);
}
}
