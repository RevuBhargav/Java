package Super;

public class ClassCExampleParent {
void math1() {
	System.out.println(10);
	System.out.println(this.math2()+56);
}
int math2() {
	System.out.println(96);
	System.out.println(75);
	return this.math3();
}
int math3() {
	System.out.println(24);
	
	return 20-30;
}
void math4() {
	System.out.println(56);
}
ClassCExampleParent(){
	
	this.math1();
	System.out.println(85);
	
}
ClassCExampleParent(int a){
	System.out.println(a+7);
}

}
