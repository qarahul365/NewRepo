package PackageXlsHandlingAssignment;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class CreateWriteDataXlsFile {

	public void WriteData() throws IOException, RowsExceededException, WriteException {
		File f = new File("../JavaLearning/Output.xls");
		WritableWorkbook ww = Workbook.createWorkbook(f);
		WritableSheet ws = ww.createSheet("Rahul", 0);
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
			Label l = new Label(j,i,"Rahul");
			ws.addCell(l);
			}
		}
		ww.write();
		ww.close();
	}
		
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		CreateWriteDataXlsFile obj = new CreateWriteDataXlsFile();
		obj.WriteData();
	}
	
	
}
