 package practiceBasicPrograms;

public class multiplicationtable2 {
void math1(int num) {
	for(int i=1;i<=10;i++) {
		System.out.println(i+"*"+num+"="+(i*num));
	}
}
public static void main(String[] args) {
	new multiplicationtable2().math1(5); 
}
}
