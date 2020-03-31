package udemyseleniumtopics;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class WritingExel {

	public static void main(String[] args) throws IOException {
		
		HSSFWorkbook workbook= new HSSFWorkbook();
		
		HSSFSheet sheet0 = workbook.createSheet("firstSheet");
		
		/*Row row0= sheet0.createRow(1);
		
		Cell cellA = row0.createCell(1);
		
		Cell cellB = row0.createCell(2);
		
		cellA.setCellValue("first cell");
		
		cellB.setCellValue("Second Cell");*/
		
		for(int rows=0; rows<10; rows++)
		{
			Row row= sheet0.createRow(rows);
			
			for(int col=0; col<10; col++) {
				
				Cell cell = row.createCell(col);
				
				cell.setCellValue((int)(Math.random()*100)); //random it means it will generate random*100 numbers
			}
		}
		
		//Connecting Stream
		File f =new File("D:\\UDemy Selenium\\MyNewExelWriter.xls");
		FileOutputStream fo=new FileOutputStream(f);
		
		workbook.write(fo);

		//closing the stream
		fo.close();
		
		System.out.println("file created");

	}
	

}
