package Inheritace2;
class parent{
	void display(int a) {
		System.out.println(a);
	}
}
class child1 extends parent{
	void show(int b) {
		System.out.println(b);
	}
}
class child2 extends parent {
	void print(int c) {
		System.out.println(c);
	}
}
public class Hierarchical_inheritance {
public static void main(String[] args) {
	child1 sc = new child1();
	sc.display(1000);
	sc.show(2000);
	child2 sca = new child2();
	sca.display(5000);
	sca.print(3000);
}
}
