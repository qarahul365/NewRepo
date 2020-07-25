package PackageFileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadfileCharbyChar {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\rahul_sharma\\Desktop\\Sampletext.txt");
		FileReader fr = new FileReader(f);
		int a=1;
		while((a=fr.read())!=-1) {
			System.out.print((char)a);
		}

	}

}
