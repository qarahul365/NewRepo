package Package1;

public class Day3Assignment1 {
	
	public Day3Assignment1() {
		this(2,3,4,5);
		System.out.println("Default constructor");
	}
	
	public Day3Assignment1(int a) {
		this();
		System.out.println("One parameterized constructor");
	}
	
	public Day3Assignment1(int x, int y) {
		this(2,3,4);
		System.out.println("Two parameterized constructor");
	}
	
	public Day3Assignment1(int u, int v, int w) {
		this(1);
		System.out.println("Three parameterized constructor");
	}
	
	public Day3Assignment1(int d, int e, int f, int g) {
		
		System.out.println("Four parameterized constructor");
	}
	
	public static void main(String[] args) {
		Day3Assignment1 Obj = new Day3Assignment1(2,3);
	}
}
