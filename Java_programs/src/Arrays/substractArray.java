package Arrays;

public class substractArray {
   public static void main(String[] args) {
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int[][] b = {{9,8,7},{6,5,4},{3,2,1}};
	int rows = a.length;
	int cols = a[0].length;
	int diff[][]= new int [rows][cols];
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			diff[i][j] = a[i][j] - b[i][j]; 
		}
	}
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.print(diff[i][j]+ " ");
       }
		System.out.println();
          }
	
   }
   }
