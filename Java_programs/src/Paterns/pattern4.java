package Paterns;

public class pattern4 {

	public static void main(String[] args) {
		int n=5;
		int num=1;
		for(int i =1;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" "+num);
				num++;
			}
			System.out.println();
		}

	}

}
