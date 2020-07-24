package Package1;

import java.util.Scanner;

public class Day4Assignment3 {
	
	public int sum(int a, int b) {
		return (a+b);
	}
	public int sub(int c, int d) {
		return (c-d);
	}
	public int mul(int e, int f) {
		return (e*f);
	}
	public void div(int g, int h) {
		System.out.println("Equation Result :" +g/h);
	}
	public static void main(String[] args) {
		Day4Assignment3 obj = new Day4Assignment3();
		Scanner s= new Scanner(System.in);
		// Calling Addition
		System.out.println("Enter the value of A");
		int X1 = s.nextInt();
		System.out.println("Enter the value of B");
		int X2 = s.nextInt();
		int addition = obj.sum(X1, X2);
		System.out.println("Addition :" +addition);
		
		// Calling Sub
		System.out.println("Enter the value of C");
		int X3 = s.nextInt();
		int Minus = obj.sub(addition, X3);
		System.out.println("Minus :" +Minus);
		
		// Calling Addition 
		System.out.println("Enter the value of D");
		int X4 = s.nextInt();
		int addition1 = obj.sum(Minus, X4);
		System.out.println("addition1 :" +addition1);
		
		// Calling Multiplication 
		System.out.println("Enter the value of E");
		int X5 = s.nextInt();
		int mul = obj.mul(addition1, X5);
		System.out.println("Multilication :" +mul);
		
		// Calling Sub 
		System.out.println("Enter the value of F");
		int X6 = s.nextInt();
		obj.div(mul, X6);
		
		
		
	}

}
