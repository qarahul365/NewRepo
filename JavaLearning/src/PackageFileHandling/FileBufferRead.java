package PackageFileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferRead {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\rahul_sharma\\Desktop\\Sampletext.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String a;
		while((a=br.readLine())!=null) {
			System.out.println(a);
		}

	}

}
