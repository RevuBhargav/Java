package Convertions;

public class BinaryToDecimal1 {
	public static int math1(int binary) {
		int sum = 0;
		int n=0;
		while(true) {
			if(binary==0){
				break;
			}
			else {
				int temp = binary%10;
				
				sum += temp*Math.pow(2,n);
				binary = binary/10;
				n++;
			}
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		new BinaryToDecimal1();
System.out.println("decimal value of 1010 : "+math1(1010));
System.out.println("decimal value of 101011 : "+math1(101011));
	}

}
