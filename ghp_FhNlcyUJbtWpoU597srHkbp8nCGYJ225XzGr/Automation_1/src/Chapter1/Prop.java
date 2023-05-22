package Chapter1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Prop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		//String url= property.getProperty("url");
		//String username =property.getproperty("user1");
		FileInputStream fis=new FileInputStream("./TestResources/td1.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		
		wb.getSheet("Sheet1").createRow(0).createCell(0).setCellValue("No of tickets sold");
	    wb.getSheet("Sheet1").createRow(1).createCell(0).setCellValue("No of tickets available");
	    wb.getSheet("sheet1").createRow(2).createCell(0).setCellValue("no of tickets kept on hold");
	    wb.getSheet("sheet1").createRow(3).createCell(0).setCellValue("no of tickets kept on hold");
		
		
		
		FileOutputStream fos=new FileOutputStream("./TestResources/td1.xlsx");
		wb.write(fos);
		wb.close();

	}

}
