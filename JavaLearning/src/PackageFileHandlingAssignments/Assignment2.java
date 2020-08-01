package PackageFileHandlingAssignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment2 {
	
	public void ReadDataGivenRange(int rowStart, int rowEnd) throws IOException {
		
		File f = new File("C:\\Users\\rahul_sharma\\Desktop\\Sampletext.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line;
		int rowCount=0;
		boolean fileRead=true;
		while((line=br.readLine())!=null) {
			rowCount=rowCount+1;
			if ((rowCount>=rowStart)&&(rowCount<=rowEnd)) {
				System.out.println(line);
				fileRead = false;
				}
			}
		if(fileRead) {
			System.out.println("Please enter valid range");
		}
	}
	
	
	
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a row range you want to read");
		System.out.println("Please enter initial row number you want to read");
		int inital = sc.nextInt();
		System.out.println("Please enter last row number till you want to read");
		int end = sc.nextInt();
		Assignment2 obj = new Assignment2();
		obj.ReadDataGivenRange(inital, end);
	}

}
