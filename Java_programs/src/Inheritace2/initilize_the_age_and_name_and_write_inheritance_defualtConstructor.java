/*Write a Java program to create a class called “Cat” with instance variables name and age. 
Implement a default constructor that initializes the name to "Unknown" and the age to 0. 
Print the values of the variables.*/

package Inheritace2;

public class initilize_the_age_and_name_and_write_inheritance_defualtConstructor {
	String name;
	int age;
public initilize_the_age_and_name_and_write_inheritance_defualtConstructor() {
	 name ="Bhargav";
	 age = 0;
		
	}
	
public static void main(String[] args) {
	initilize_the_age_and_name_and_write_inheritance_defualtConstructor a = new initilize_the_age_and_name_and_write_inheritance_defualtConstructor();
	
	System.out.println("name :"+a.name);
	System.out.println("age :"+a.age);
}
}
