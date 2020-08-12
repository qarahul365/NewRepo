package PackageXlsHandlingAssignment;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment2 {
	public static void ReadDataBasedUponRowNo(int rNumber) throws BiffException, IOException{
		File f = new File("../JavaLearning/Sheet1.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet wk = wb.getSheet(0);
		int colCount = wk.getColumns();
		for (int j=0;j<colCount;j++) {
				Cell c = wk.getCell(j,rNumber);
				System.out.print(c.getContents()+ " ");
			}
		}
		
	
	
	public static void main(String[] args) throws BiffException, IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the row number you want to read");
		int row = scan.nextInt();
		ReadDataBasedUponRowNo(row);
	}
}
