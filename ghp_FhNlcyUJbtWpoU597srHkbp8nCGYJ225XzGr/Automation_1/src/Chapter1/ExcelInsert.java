package Chapter1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelInsert {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis =new FileInputStream("./testdata.xlsx");
		
		Workbook wb= WorkbookFactory.create(fis);
		
		Sheet s=wb.getSheet("sheet1");
		Row r=s.getRow(0);
		Cell c=r.createCell(3);
		c.setCellValue("tickets");
		
		FileOutputStream fos=new FileOutputStream("./testdata.xlsx");
		wb.write(fos);
		wb.close();


	}

}
