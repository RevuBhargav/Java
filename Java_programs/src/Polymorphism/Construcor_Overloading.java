package Polymorphism;

public class Construcor_Overloading {
	double height,weight,depth;
	Construcor_Overloading(){
		height = weight= depth=0;
	}
	Construcor_Overloading(double h,double w,double d){
		height =h;
		weight = w;
		depth = d;
	}
	Construcor_Overloading(double len){
		height = weight = depth=len;
	}
	double valume() {
		return (height* weight*depth);
	}
}
