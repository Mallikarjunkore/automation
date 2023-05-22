package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./TestResources/td1.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		
		wb.getSheet("Sheet1").createRow(0).createCell(0).setCellValue("No of tickets sold");
	    wb.getSheet("Sheet1").createRow(1).createCell(0).setCellValue("No of tickets available");
		
		
		
		FileOutputStream fos=new FileOutputStream("./TestResources/td1.xlsx");
		wb.write(fos);
		wb.close();

	}

}
