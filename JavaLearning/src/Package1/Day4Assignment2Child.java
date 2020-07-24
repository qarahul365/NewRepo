package Package1;

public class Day4Assignment2Child extends Day4Assignment2{

	public void Method2() {
		this.Method2(2);
		System.out.println("Child Default Method");
		
	}
	public void Method2(int a) {
		this.Method2(2,3,5);
		System.out.println("Child 1 Parameterized Method");
		
	}
	public void Method2(int a, int b, int c) {
		super.Method1(2, 3, 4, 5);
		System.out.println("Child 3 Parameterized Method");
		
	}
	public void Method2(int a, int b, int c, int d) {
		this.Method2();
		System.out.println("Child 4 Parameterized Method");
		}
	public static void main(String[] args) {
		Day4Assignment2Child obj = new Day4Assignment2Child();
		obj.Method2(2, 3, 4, 5);
		
	}
	
}
