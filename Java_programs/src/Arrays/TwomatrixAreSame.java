package Arrays;

import java.util.Scanner;

public class TwomatrixAreSame {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a rows");
	int a= sc.nextInt();
	System.out.println("Enter a cols");
	int b= sc.nextInt();
	System.out.println("Enter the numbers");
	int c[][]=new int[a][b];
	int d[][]=new int[a][b];
	for(int i=0;i<a;i++) {
		for(int j=0;j<b;j++) {
			c[i][j]=sc.nextInt();
		}
	}
	
	
	for(int i=0;i<a;i++) {
		for(int j=0;j<b;j++) {
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
	for(int i=0;i<a;i++) {
		for(int j=0;j<b;j++) {
			d[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<a;i++) {
		for(int j=0;j<b;j++) {
			System.out.print(d[i][j]+" ");
		}
		System.out.println();
	}
	 int row1 = 0,row2=0,col1=0,col2=0;
	boolean flag = true;
//	if(row1 != row2 || col1 != col2){    
//         System.out.println("Matrices are not equal");    
//     }    
//     else {    
//         for(int i = 0; i < row1; i++){    
//             for(int j = 0; j < col1; j++){    
//               if(c[i][j] != d[i][j]){    
//                   flag = false;    
//                   break;    
//               }    
//             }    
//         }    
//     }    
	if(row1!=row2||col1!=col2) {
		System.out.println("not equal");
		
	}
	else {
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				if(c[i][j]!=d[i][j]) {
					flag =true;
					break;
				}
			}
		}
	}
         if(flag)    
             System.out.println("Matrices are equal");    
         else    
             System.out.println("Matrices are not equal");    
     }    
     
}


