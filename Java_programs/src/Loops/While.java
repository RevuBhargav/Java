package Loops;

public class While {
public static void main(String[] args) {
	int i=1;
	while(i<5) {
		System.out.println("hi : "+i);
		i++;
		int j=1;
		while(j<4) {
			System.out.println("hello : "+j);
			j++;
		}
	}
}
}
