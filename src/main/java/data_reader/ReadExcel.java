package data_reader;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public String[][] readExcelData(String sheeetName) throws IOException {

		XSSFWorkbook wbook = new XSSFWorkbook("./DataRead/"+sheeetName+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		XSSFRow HeaderRow = sheet.getRow(0);
		int lastCellNum = HeaderRow.getLastCellNum();
		System.out.println(lastCellNum);	
		String[][] data =  new String[lastRowNum][lastCellNum];
		for (int i = 1; i <=lastRowNum ; i++) {
			
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				
				
				System.out.println(value);
				data[i-1][j]=value;
			}
		}
		wbook.close();
		return data;
		
	}

}
