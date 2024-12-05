package Arrays;

import java.util.Scanner;

public class classA {
void math1() {
	Scanner  sc =new Scanner(System.in);
	System.out.println("please enter a number of elements");
	int length = sc.nextInt();
	int arr[] = new int[length];
	//int a[]= {10,20,30,40,50,60};
	//int a1 = new int[5];
	
	System.out.println("length : "+arr.length);
	System.out.println("please enter "+arr.length+" elements : ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("elements : ");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	System.out.println("-------for each-------");
	for(int x : arr) {
		System.out.println(x);
	}
	System.out.println("only i have 3 elemts in index 3 ");
	
	for(int i=arr.length-2;i>=1;i--) {
		System.out.println(arr[i]);
	}
}
public static void main(String[] args) {
	new classA().math1();
}
}
