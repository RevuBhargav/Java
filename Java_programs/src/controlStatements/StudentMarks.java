package controlStatements;

public class StudentMarks {
public static void main(String[] args) {
	int marks=92;
	if(marks<35) {
		System.out.println("Grade D");
	}
	else if(marks<=35 && marks<50) {
		System.out.println("Grade c");
	}
	else if(marks>=50 && marks<60) {
		System.out.println("Grade B");
	}
	else if(marks>=60 && marks<92) {
		System.out.println("Grade A");
	}
	else if(marks>=92 && marks<100) {
		System.out.println("Grade O");
	}
	else {
		System.out.println("fail");
	}
}
}
