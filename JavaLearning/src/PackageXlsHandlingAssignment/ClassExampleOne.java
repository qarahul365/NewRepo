package PackageXlsHandlingAssignment;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ClassExampleOne {

	public void ExcelReadData() throws BiffException, IOException {
		File f = new File("../JavaLearning/Sheet1.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		int row = ws.getRows();
		int column = ws.getColumns();
		for (int i=0;i<row;i++) {
			for (int j=0;j<column;j++) {
				Cell c1 = ws.getCell(j,i);
				System.out.print(c1.getContents()+ " ");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) throws BiffException, IOException {
		ClassExampleOne obj = new ClassExampleOne();
		obj.ExcelReadData();
	}
	
}
