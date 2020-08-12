package PackageXlsHandlingAssignment;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Assignment4 {

	public static void WriteData(int rowCount, int colCount) throws BiffException, IOException, RowsExceededException, WriteException {
		File f = new File("../JavaLearning/Output1.xls");
		WritableWorkbook ww = Workbook.createWorkbook(f);
		WritableSheet ws = ww.createSheet("Rahul", 0);
		for (int j=0;j<colCount;j++) {
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			Label l = new Label(j,rowCount,str);
			ws.addCell(l);
			}
		ww.write();
		ww.close();

	}
	public static void main(String[] args) throws RowsExceededException, BiffException, WriteException, IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the row number in which you want to enter data");
		int rNumber = scan.nextInt();
		System.out.println("Please enter the column number till you want to enter data");
		int cNumber = scan.nextInt();
		WriteData(rNumber, cNumber);
	}
	
}
