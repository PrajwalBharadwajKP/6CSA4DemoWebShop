package Generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements IConstants{
	public String readDataFromExcel(String sheet, int row, int col) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(EXCEL_PATH);
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheet).getRow(row).getCell(col).toString();
	}
}