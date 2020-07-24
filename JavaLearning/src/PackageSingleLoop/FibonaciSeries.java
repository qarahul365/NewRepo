package PackageSingleLoop;

import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fibonacci series limit");
		int num = sc.nextInt();
		int num1 =0;
		int num2=1;
		int num3=0;
		System.out.print(num1+" "+num2);
		for (int i=0; i<num; i++) {
			num3=num1+num2;
			System.out.print(" "+num3);    
			num1=num2;    
			num2=num3; 
		}
		

	}

}
