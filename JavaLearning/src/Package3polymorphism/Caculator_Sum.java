package Package3polymorphism;

public class Caculator_Sum {
	
	public void Sum(int a, int b) {
		int c=0;
		c=a+b;
		System.out.println("Parent Sum is :" + c);
		}
	public void Sum(int a, int b, int c) {
		int d=0;
		d=a+b+c;
		System.out.println("Parent Sum is :" + d);
		}
	public void Sum(int a, int b, int c, int d) {
		int e=0;
		e=a+b+c+d;
		System.out.println("Parent Sum is :" + e);
		}
}
