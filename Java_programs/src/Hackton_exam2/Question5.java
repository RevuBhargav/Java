package Hackton_exam2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length : ");
		int a = sc.nextInt();

		int arr[] = new int[a];
		int arr1[] = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
//		for (int i = 0; i < a; i++) {
//			System.out.print(arr[i] + " ");
//		}
		for (int j = 0; j < a; j++) {
			arr1[j] = sc.nextInt();
		}
//		for (int j = 0; j < a; j++) {
//			System.out.print(arr[j] + " ");
//		}
		
		for (int i = 0; i < a; i++) {
			
			for (int j = 0; j < a; j++) {
//				System.out.println(arr[i]+"---"+arr1[j]);
				
				if (arr[i] == arr1[j]) {
					
					System.out.println("common elements :" + arr[i]);
				}
				
			}

		}
	}
}
