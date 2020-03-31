package udemyseleniumtopics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExel {

	public static void main(String[] args) throws Exception, IOException {
		
		File f= new File("D:\\\\UDemy Selenium\\\\MyNewExelWriter.xls");
		FileInputStream fi=new FileInputStream(f);
		
		Workbook workbook= WorkbookFactory.create(fi);
		
		Sheet sheet=workbook.getSheetAt(0);
		
		for(Row row: sheet) {
			
			for (Cell cell:row) {
				
				switch(cell.getCellType())
				{
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_BLANK:
					System.out.print("Blank Cell"+"\t");
				break;
				}
				
			}
			
			System.out.println();
		}
		
		/*Row row=sheet.getRow(0);
		
		Cell cellA=row.getCell(0);
		
		System.out.println(cellA);*/
		
		fi.close();
	}

}
