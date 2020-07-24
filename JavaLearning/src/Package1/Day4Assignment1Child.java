package Package1;

public class Day4Assignment1Child extends Day4Assignment1{

	public Day4Assignment1Child() {
		this(1);
		System.out.println("Child Default Constructor");
	}
	public Day4Assignment1Child(int a1) {
		this(1,2,3);
		System.out.println("Child 1 parameterized Constructor");
	}
	public Day4Assignment1Child(int b1, int c1, int d1) {
		super(2,3);
		System.out.println("Child 3 parameterized Constructor");
	}
	public Day4Assignment1Child(int e1, int f1, int g1, int h1) {
		this();
		System.out.println("Child 4 parameterized Constructor");
	}

	public static void main(String[] args) {
		Day4Assignment1Child obj = new Day4Assignment1Child(2,3,4,5);	
	}
	
	
	
}
