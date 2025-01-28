package Arrays;

import java.util.Scanner;

public class CommonElementsInThreeElements {
	public static void common(int arr1[],int arr2[],int arr3[]) {
		int x=0,y=0,z=0;
		while(x<arr1.length && y < arr2.length && z < arr3.length) {
			if(arr1[x]==arr2[y]&& arr2[y]==arr3[z]) {
				System.out.println(arr1[x]);
				x++;
				y++;
				z++;
			}
				else if(arr1[x]>arr2[y]) {
					y++;
				}
				else if(arr2[y]>arr3[z]) {
					z++;
				}
				else {
					x++;
				}
			}
		}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the rows: ");	
	int a = sc.nextInt();
	
	int arr[]=new int[a];
	int arr1[]=new int[a];
	int arr2[]=new int[a];
	for(int i=0;i<a;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<a;i++) {
		System.out.print(arr[i]+" "); 
	}
	for(int j=0;j<a;j++) {
		arr[j]=sc.nextInt();
	}
	for(int j=0;j<a;j++) {
		System.out.print(arr[j]+" "); 
	}
	
	common(arr,arr1,arr2);
			
	}
}

