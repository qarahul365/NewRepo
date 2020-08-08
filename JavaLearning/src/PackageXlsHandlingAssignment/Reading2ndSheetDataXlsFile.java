package PackageXlsHandlingAssignment;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Reading2ndSheetDataXlsFile {
	
	public void ReadData() throws BiffException, IOException {
		File f = new File("../JavaLearning/Sheet1.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet sheet = wb.getSheet(1);
		int row = sheet.getRows();
		int col = sheet.getColumns();
		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				Cell c = sheet.getCell(j, i);
				System.out.print(c.getContents()+ " ");
			}
			System.out.println("");
		}
		
	}

	public static void main(String[] args) throws BiffException, IOException {
		Reading2ndSheetDataXlsFile obj = new Reading2ndSheetDataXlsFile();
		obj.ReadData();
	}
}
