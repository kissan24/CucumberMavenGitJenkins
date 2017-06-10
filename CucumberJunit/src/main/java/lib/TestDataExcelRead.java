package lib;

import java.util.HashMap;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataExcelRead {

	public static HashMap<String, HashMap<String,String>> initializeTestData() {
		
		HashMap<String, HashMap<String,String>> rowMap= new HashMap<String, HashMap<String,String>>();
		try {
			FileInputStream fs = new FileInputStream("TestData.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet("CucumberTestData");
			Row HeaderRow = sheet.getRow(0);
			for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
				Row currentRow = sheet.getRow(i);
				HashMap<String,String> currentHash = new HashMap<String,String>();
				for (int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++) {
					Cell currentCell = currentRow.getCell(j);
					switch (currentCell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						System.out.println(currentCell.getStringCellValue() + "\t");

						currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
						break;
					}
				}
				System.out.println("Test case name 1st "+currentRow.getCell(0).getStringCellValue().trim());
				rowMap.put(currentRow.getCell(0).getStringCellValue().trim(), currentHash);
			}

			fs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowMap;
	}
	
	public static void main(String[] args){
		HashMap<String, HashMap<String,String>> rowMap=initializeTestData();
		System.out.println("1st row 3rd value "+ rowMap.get("Test case3").get("Val3") );
		
	}
}
