package Package4SwitchCase;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
			
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter first number");
	int a = sc.nextInt();
	
	System.out.println("Please enter second number");
	int b = sc.nextInt();
	
	System.out.println("Please enter Add, Sub, Mult, Div");
	String operation = sc.nextLine();
	
	switch (operation) {
		case "Add" :
			int sum;
			sum = a+b;
			System.out.println("Addition is: " +sum );
			break;
		case "Sub" :
			int sub;
			sub = a-b;
			System.out.println("Addition is: " +sub );
			break;
		case "Mult":
			int mult;
			mult = a*b;
			System.out.println("Addition is: " +mult );
			break;
		case "Div":
			int div;
			div = a/b;
			System.out.println("Addition is: " +div );
			break;
		default :
			System.out.println("Please enter correct operator Add Sub Mult Div");
	}
}
}