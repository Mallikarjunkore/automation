package Chapter1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDATA {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("./testdata.xlsx");
		
		Workbook wb= WorkbookFactory.create(fis);
		
		Sheet sh= wb.getSheet("sheet");
		
		Row r=sh.getRow(1);
		
		Cell c=r.getCell(1);
		
		System.out.println(c.getStringCellValue());
		
		wb.close();

	}

}
