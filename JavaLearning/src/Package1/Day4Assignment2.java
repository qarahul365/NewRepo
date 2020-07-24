package Package1;

public class Day4Assignment2 {
	
	public void Method1() {
		System.out.println("Parent Default Method");
		this.Method1(2);
	}
	public void Method1(int a) {
		System.out.println("Parent 1 Parameterized Method");
		this.Method1(2, 3, 4);
	}
	public void Method1(int a, int b) {
		System.out.println("Parent 2 Parameterized Method");
		
	}
	public void Method1(int a, int b, int c) {
		System.out.println("Parent 3 Parameterized Method");
		this.Method1(2, 3);
	}
	public void Method1(int a, int b, int c, int d) {
		System.out.println("Parent 4 Parameterized Method");
		this.Method1();
	}

}
