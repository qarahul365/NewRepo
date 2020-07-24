package Package2Inheritance;

public class Child extends Father{
		int c=3;
		public void ChildMethod1() {
		System.out.println("I am Child method 1");
	}
		public void ChildMethod2() {
			System.out.println("I am Child method 2");
		}
		
		public static void main(String[] args) {
			Child obj = new Child();
			obj.GrandMethod1();
			obj.GrandMethod2();
			obj.ChildMethod1();
			obj.ChildMethod2();
			obj.FatherMethod1();
			obj.FatherMethod2();
			System.out.println(obj.a);
			System.out.println(obj.b);
			System.out.println(obj.c);
		}
}
