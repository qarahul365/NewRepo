package PackageSingleLoop;

import java.util.Scanner;

public class SwappingUsingVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1 = sc.nextInt();
		System.out.println("Please enter second number");
		int num2 = sc.nextInt();
		System.out.println("Numbers before Swapping");
		System.out.println("Number 1:" +num1);
		System.out.println("Number 2:" +num2);
		
		int temp=0;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Numbers after Swapping");
		System.out.println("Number 1:" +num1);
		System.out.println("Number 2:" +num2);
		
	}

}
