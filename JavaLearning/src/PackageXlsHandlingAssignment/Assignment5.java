package PackageXlsHandlingAssignment;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Assignment5 {

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		
		File readFile = new File("../JavaLearning/Sheet1.xls");
		File writeFile = new File("../JavaLearning/Output2.xls");
		
		Workbook readWb = Workbook.getWorkbook(readFile);
		Sheet readWs = readWb.getSheet(0);
		int rowCount = readWs.getRows();
		int colCount = readWs.getColumns();
		
		WritableWorkbook writeWb = Workbook.createWorkbook(writeFile);
		WritableSheet writeWs = writeWb.createSheet("Rahul", 0);
				
		for (int i=0;i<rowCount;i++) {
			for (int j=0;j<colCount;j++) {
				Cell c = readWs.getCell(j, i);
				String str = c.getContents();
				Label l = new Label(j,i,str);
				writeWs.addCell(l);
			}
			
		}
		writeWb.write();
		writeWb.close();
		
	}
	
}
