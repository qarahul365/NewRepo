package Package1;

public class Day2Assignment2 {
	
	// (((((10-2)+2)+2)*2)/2)
	
	public int Subtraction(int a, int b) {
		return (a-b);
	}
	
	public int Addition(int d, int e) {
		return (d+e);
	}
	
	public int Multiplication(int f, int g) {
		return (f*g);
	}
	
	public void Division(int h, int i) {
		int z=h/i;
		System.out.println("Equation Result 2 : " +z);
	}
	
	public static void main(String[] args) {
		Day2Assignment2 D2 = new Day2Assignment2();
		int Sub=D2.Subtraction(10, 2);
		int Sum=D2.Addition(Sub, 2);
		int Sum1=D2.Addition(Sum, 2);
		int Mult=D2.Multiplication(Sum1, 2);
		D2.Division(Mult, 2);
	}

}
