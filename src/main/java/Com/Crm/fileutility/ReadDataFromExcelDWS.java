package Com.Crm.fileutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelDWS {
public String exceldata(String sh,int row,int cell) throws EncryptedDocumentException, IOException 
{
FileInputStream fis=new FileInputStream("C:\\Supriya\\DataDrivenTesting\\DWSExcelData.xlsx");
Workbook wb=WorkbookFactory.create(fis);
Sheet sheet=wb.getSheet(sh);
String data=sheet.getRow(row).getCell(cell).toString();
return data;
}
}
