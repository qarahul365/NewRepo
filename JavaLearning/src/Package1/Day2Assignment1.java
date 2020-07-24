package Package1;

public class Day2Assignment1 {
	// (((((10+2)-2)*2)+2)/2)
	
	public int Addition(int a, int b) {
		return (a+b);
	}
	
	public int subtraction(int d, int e) {
		return (d-e);
	}
	
	public int multiplication(int f, int g) {
		return (f*g);
	}
	
	public void division(int x, int y) {
		int z=x/y;
		System.out.println("Equation Result = " +z);
	}
	
	public static void main(String[] args) {
		
		Day2Assignment1 D1= new Day2Assignment1();
		int Sum =D1.Addition(10,2);
		int Sub=D1.subtraction(Sum, 2);
		int mult=D1.multiplication(Sub, 2);
		int Sum1= D1.Addition(mult, 2);
		D1.division(Sum1, 2);
		
		
	}
	
}
