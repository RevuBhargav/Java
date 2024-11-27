package controlStatements;

public class exampleJump {
	void math1(int b) {
		int a = 10;
		while(a<=20) {
			if(a==15) {
				while(b<=30) {
					if(b==25) {
						break;
					}
					System.out.println("b value"+b);
					b++;
				}
			}
			System.out.println("a value "+a);
			a++;
		}
	}

	public static void main(String[] args) {
		exampleJump obj = new exampleJump();
		obj.math1(20);

	}

}
