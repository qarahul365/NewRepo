package PackageFileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteOperation {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\rahul_sharma\\Desktop\\Sampletext.txt");
		FileWriter fr = new FileWriter(f);
		fr.write("This is the new line entered");
		fr.close();
		

	}

}
