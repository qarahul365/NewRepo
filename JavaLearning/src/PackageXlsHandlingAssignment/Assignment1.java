package PackageXlsHandlingAssignment;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment1 {
	
	public static void ReadDataBasedUponRowNoAndColumnNo(int rNumber, int cNumber) throws BiffException, IOException {
		File f = new File("../JavaLearning/Sheet1.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		Cell c1 = ws.getCell(cNumber,rNumber);
		System.out.print(c1.getContents()+ " ");
		}

	public static void main(String[] args) throws BiffException, IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the row number");
		int row = scan.nextInt();
		System.out.println("Please enter the Column number");
		int col = scan.nextInt();
		Assignment1.ReadDataBasedUponRowNoAndColumnNo(row, col);
	}
}
