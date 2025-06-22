package ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File src = new File("C:\\Users\\ADMIN\\Desktop\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		
		//for .xls files
		//HSSFWorkbook xsf = new HSSFWorkbook(fis);
		XSSFSheet sheet = xsf.getSheetAt(0);
		String entry1 = sheet.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println("Data in box is :"+entry1);
		xsf.close();
	}

}
