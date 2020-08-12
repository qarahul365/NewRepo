package PackageXlsHandlingAssignment;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment3 {
	public static void ReadDataBasedUponRange(int fRow, int lRow) throws BiffException, IOException {
		File f = new File("../JavaLearning/Sheet1.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		int colCount = ws.getColumns();
		for (int i=fRow;i<=lRow;i++) {
			for (int j=0;j<colCount;j++) {
				Cell c = ws.getCell(j, i);
				System.out.print(c.getContents()+ " ");
			}
			System.out.println("");
		}
		
	}
	
	public static void main(String[] args) throws BiffException, IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first row number");
		int firstRow = scan.nextInt();
		System.out.println("Please enter last row number");
		int lastRow = scan.nextInt();
		ReadDataBasedUponRange(firstRow, lastRow);
	}

}
