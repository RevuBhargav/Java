/*Write a Java program to create a class called  Dog with instance variables name and color. 
 *Implement a parameterized constructor that takes name and color as parameters and initializes the 
 *instance variables. Print the values of the variables.*/

package Constructor;

public class Parameterized_Constructor {
 String name;
 String color;
 public Parameterized_Constructor( String name ,String color) {
	 this.name = name;
	 this.color = color;
	 
 }
 public static void main(String[] args) {
	 Parameterized_Constructor a = new Parameterized_Constructor("dog","white");
	 
	 System.out.println("name :"+a.name);
	 System.out.println("color :"+a.color);
}
}
