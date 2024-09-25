package dataProviderInTestng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WorkingWithExcel {
	@Test
	public void excelCode() throws IOException {
		String path="C:\\Users\\ANUPAM KUMAR\\OneDrive\\Desktop\\Get_Data_Excel.xlsx";
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Custom");
		
		int row=sh.getLastRowNum(); //count start with 0
		System.out.println(row); 
		
		int row1=sh.getPhysicalNumberOfRows(); //count start from 1
		System.out.println(row1); 
		
		int col=sh.getRow(0).getLastCellNum(); //give number of column
		System.out.println(col);
		
		for(int r=0; r<row;r++) {
			for(int c=0;c<col;c++) {
			System.out.println(sh.getRow(r+1).getCell(c).getStringCellValue());	
			}
		}
		
		fis.close();
		wb.close();
		
		
		
	}

}
