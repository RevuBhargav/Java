package Super;

public class ClassCExampleChild extends ClassCExampleParent {
void display() {
	System.out.println("hi");
	super.math4();
}
public static void main(String[] args) {
	new ClassCExampleChild().display();
}
}
