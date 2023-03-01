package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class contain reusable methods to perform actions on excel file
 * @author nikhildas
 *
 */

public class ExcelUtility {
	private Workbook wb;
	/**
	 * convert file to java readable one
	 * tHIS METHOD IS USED FOR INITIALIZE THE EXCEL FILE
	 */
	public void excelInitialization(String excelPath)
	{
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream(excelPath);
		} 
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		try
		{
			wb = WorkbookFactory.create(fis);
		} 
		catch(EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * THIS METHOD IS USED TO READ SINGLE DATA FROM EXCEL
	 * @param sheetName
	 * @param rownum
	 * @param cellNum
	 * @return
	 */
	public String readDataFromExcel(String sheetName,int rowNum,int cellNum)
	{
		return wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	/**
	 * THIS METHOD IS USED FOR READ MULTIPLE DATA FROM EXCEL FILE
	 * @return
	 */
	public List<String> readDataFromExcel(String sheetName){
		Sheet sh = wb.getSheet(sheetName);
		List<String> dataList = new ArrayList<>();
		
		for(int i=0;i<=sh.getLastRowNum();i++)
			{
				dataList.add(sh.getRow(i).getCell(1).getStringCellValue());
			}
			return dataList;
	}
/**
 * USED TO CLOSE THE EXCEL WORKBOOK
 */
	public void closeExcel()
	{
		try 
		{
			wb.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
