package Arrays;

public class AddTwoMatrices {

	public static void main(String[] args) {
		int a1[][]= {{1,3,4},{2,4,3},{1,2,4}};
		int a2[][]= {{1,3,4},{2,4,3},{1,2,4}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				c[i][j]=a1[i][j]+a2[i][j];
				System.out.print(c[i][j]+" ");
			}
		}
          System.out.println();    
	}

}
