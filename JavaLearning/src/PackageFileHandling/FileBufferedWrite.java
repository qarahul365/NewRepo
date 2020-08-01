package PackageFileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedWrite {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\rahul_sharma\\Desktop\\Sampletext.txt");
		FileWriter fr = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fr);
		bw.newLine();
		bw.write("This is the first line");
		bw.newLine();
		bw.write("This is the second line");
		bw.close();
		
		

	}

}
