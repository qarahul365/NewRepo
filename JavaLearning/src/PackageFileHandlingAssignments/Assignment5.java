package PackageFileHandlingAssignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment5 {
	
	 public static void main(String[] args) throws IOException {
	 File f = new File("C:\\Users\\rahul_sharma\\Desktop\\Sampletext.txt");
	 FileReader fr = new FileReader(f);
	 BufferedReader br = new BufferedReader(fr);
	 File f1 = new File("C:\\Users\\rahul_sharma\\Desktop\\Text.txt");
	 FileWriter fw = new FileWriter(f1);
	 BufferedWriter bw = new BufferedWriter(fw);
	 String a;
	 while((a=br.readLine())!=null) {
		 bw.write(a);
		 bw.newLine();
	  }
	 bw.close();
	 
		 
		 
	}
	
	
  /*  public static void main(String args[])throws IOException
    {
          FileInputStream Fread =new FileInputStream("C:\\Users\\rahul_sharma\\Desktop\\Sampletext.txt");
          FileOutputStream Fwrite=new FileOutputStream("C:\\Users\\rahul_sharma\\Desktop\\Text1.txt") ;
          System.out.println("File is Copied");
          int c;
          while((c=Fread.read())!=-1)
          Fwrite.write((char)c);
          Fread.close();
          Fwrite.close();
     }
     */
	


}
