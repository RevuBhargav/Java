package Abstarct;

public class Animal_Tiger extends Animal {
   void sound() {
	   System.out.println("Tiger is walk");
   }
   public static void main(String[] args) {
	Animal tiger = new Animal_Tiger();
	tiger.sound();
	Animal lion = new Animal_lion();
	lion.sound();
}
}
