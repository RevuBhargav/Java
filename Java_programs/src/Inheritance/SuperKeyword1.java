package Inheritance;

public class SuperKeyword1 {
void math1() {
	System.out.println(10);
	System.out.println(this.math2()+56);
}
int math2() {
	System.out.println(75);
	System.out.println(96);
	return this.math3();
}
int math3() {
	System.out.println(74);
	System.out.println(92);
	return 74-92;
}
void math4() {
	System.out.println(56);
}
SuperKeyword1(){
	this(52);
	this.math1();
	System.out.println(85);
}
SuperKeyword1(int a){
	System.out.println(a+7);
}
}
