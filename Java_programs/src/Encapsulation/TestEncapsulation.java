package Encapsulation;
class Encapsulation{
	private String name;
	 private int rollno;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class TestEncapsulation {
public static void main(String[] args) {
	Encapsulation sc = new Encapsulation();
	sc.setRollno(200);
	sc.setAge(24);
	sc.setName("Bhargav");
	
	System.out.println("name : "+sc.getName());
	System.out.println("age : "+sc.getAge());
	System.out.println("roll no : "+sc.getRollno());
}
}
