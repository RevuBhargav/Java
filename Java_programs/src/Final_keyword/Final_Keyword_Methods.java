package Final_keyword;
 class test1{
 void m() {
		System.out.println("testing for final keyword......");
	}
}
class test2 extends test1{
	void m(){
		System.out.println("final");
	}
}
public class Final_Keyword_Methods {
public static void main(String[] args) {
	test2 t = new test2();
	t.m();
}
}

/*
 *Variables - we can't change the value of variables(constants).
 *Methods - we can't override those methods in child classes.
 *we can't extends the class.
*/