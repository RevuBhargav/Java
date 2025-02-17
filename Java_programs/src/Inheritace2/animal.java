package Inheritace2;

public class animal {
String color ="white";
}
class dog extends animal{
	String color = "black";
	void display() {
		System.out.println(super.color);
	}
}
