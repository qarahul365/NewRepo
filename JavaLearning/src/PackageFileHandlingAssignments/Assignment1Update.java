package PackageFileHandlingAssignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment1Update {

		public void ReadFileData(int linenumber) throws IOException 
		{
		File f = new File("C:\\Users\\rahul_sharma\\Desktop\\Sampletext.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line;
		int rowCount=0;
		boolean linefound = true;
		while ((line=br.readLine())!=null) {
			rowCount=rowCount+1;
			if (rowCount==linenumber) {
				System.out.println(line);
				linefound=false;
				break;
			}
			}
		if(linefound) {
			System.out.println("Line does not exist");
		}
		}
		
		public static void main(String[] args) throws IOException 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the line number");
			int l = sc.nextInt();
			Assignment1Update obj = new Assignment1Update();
			obj.ReadFileData(l);
		}
	
}
