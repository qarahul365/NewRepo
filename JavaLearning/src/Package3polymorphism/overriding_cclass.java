package Package3polymorphism;

public class overriding_cclass extends overriding_pclass{
	public int arithmatic(int a, int b) {
		int c;
		c=a-b;
		System.out.println("Subtraction is: " + c);
		return c;
	}
	
	public static void main(String[] args) {
		overriding_cclass obj = new overriding_cclass();
		obj.arithmatic(20, 5);
	}

}
