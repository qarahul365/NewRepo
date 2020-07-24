package Package3polymorphism;

public class calc_main extends Caculator_Sum{

	public void Sum(int p, int q) {
		int c=0;
		c=p+q;
		System.out.println("Child Sum is :" + c);
		}
	
	public static void main(String[] args) {
		
		calc_main obj = new calc_main();
		obj.Sum(2, 4);
		
		
		
	}
	
}
