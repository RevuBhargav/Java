package Loops;

public class daysPrinting {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		System.out.println("day : "+i);
		for(int j=0;j<=9;j++) {
			System.out.println("  "+(j+8)+"-"+(j+9));
		}
	}
}
}