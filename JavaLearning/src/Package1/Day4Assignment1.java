package Package1;

public class Day4Assignment1 {
	
	public Day4Assignment1() {
		this(2,3,4,5);
		System.out.println("Parent Default Constructor");
	}
	public Day4Assignment1(int a) {
		this();
		System.out.println("Parent 1 parameterized Constructor");
	}
	public Day4Assignment1(int b, int c) {
		this(2,3,4);
		System.out.println("Parent 2 parameterized Constructor");
	}
	public Day4Assignment1(int d, int e, int f) {
		this(1);
		System.out.println("Parent 3 parameterized Constructor");
	}
	public Day4Assignment1(int g, int h, int i, int j) {
		System.out.println("Parent 4 parameterized Constructor");
	}

}
