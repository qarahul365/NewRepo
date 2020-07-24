package Package1;

public class Student {

	int age=28;
	int roll_no=48;
	public void display1() {
		System.out.println("Welcome to all of you");
	}
	public void display2() {
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
	Student s1 = new Student();
	System.out.println(s1.age);
	System.out.println(s1.roll_no);
	s1.display1();
	s1.display2();
	}
}
