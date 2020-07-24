package Package1;

public class Day3Assignment2 {
	
	public void Method() {
		System.out.println("Default Method");
		this.Method(1,2,3,4);
	}
	public void Method(int a) {
		System.out.println("One para Method");
	}
	public void Method(int b, int c) {
		System.out.println("Two para Method");
		this.Method(1);
	}
	public void Method(int d, int e, int f) {
		System.out.println("Three para Method");
		this.Method();
	}
	public void Method(int g, int h, int i, int j) {
		System.out.println("Four para Method");
		this.Method(1,2);
	}
	
	public static void main(String[] args) {
		Day3Assignment2 obj = new Day3Assignment2();
		obj.Method(2,3,4);
	}

}
