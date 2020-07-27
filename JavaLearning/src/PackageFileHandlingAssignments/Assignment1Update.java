package PackageFileHandlingAssignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment1Update {

		public void ReadData(int linenumber) throws IOException 
		{
		File f = new File("C:\\Users\\rahul_sharma\\Desktop\\Sampletext.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line;
		int rowCount=0;
		while(br.readLine()!=null)
			rowCount++;
		System.out.println("Total rows :" +rowCount);
		
		
		
		}
		
		public static void main(String[] args) throws IOException 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the line number");
			int l = sc.nextInt();
			Assignment1 obj = new Assignment1();
			obj.ReadData(l);
		}
	
}
