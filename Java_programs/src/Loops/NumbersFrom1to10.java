package Loops;

public class NumbersFrom1to10 {
public static void main(String[] args) {
	for(int i=2;i<=20;i++) {
		if(i%2==0) {
			if(i==14)
				continue;
			System.out.print(i+" ");
		}
	}
}
}
