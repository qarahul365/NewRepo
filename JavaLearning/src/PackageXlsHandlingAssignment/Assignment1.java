package PackageXlsHandlingAssignment;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment1 {
	
	public static void ReadDataBasedUponRowNoAndColumnNo(int rNumber, int cNumber) throws BiffException, IOException {
		File f = new File("../JavaLearning/Sheet1.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		int row = ws.getRows();
		int column = ws.getColumns();
		for (int i=0;i<row;i++) {
			for (int j=0;j<column;j++) {
				if((i==rNumber) && (j==cNumber)) {
					Cell c1 = ws.getCell(j,i);
					 System.out.print(c1.getContents()+ " ");
				}
				
			}
		}
	}

	public static void main(String[] args) throws BiffException, IOException {
		Assignment1.ReadDataBasedUponRowNoAndColumnNo(0, 2);
	}
}
