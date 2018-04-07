package com.automation.selenium.TestFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreading {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       // String path = "D:\\Test_Automation\\excelsheet\\Book.xlsx";
        
        File file1 = new File("./ExcelSheet/Book1.xlsx");
        InputStream XlsxFileToRead = new FileInputStream(file1);
        Workbook wb = null;
		try {
			wb = new XSSFWorkbook(XlsxFileToRead);
		 Sheet sh =	wb.getSheet("Sheet1");
		    Iterator<Row> row =  sh.rowIterator();
		    Iterator<Row> rowIterator = sh.rowIterator();
	        while (rowIterator.hasNext()) {
	            Row row1 = rowIterator.next();
	            
	            Iterator<Cell> cellIterator = row1.cellIterator();
	           while(cellIterator.hasNext())
	           {
	        	   Cell cell1 = cellIterator.next();
	        	  
	        			 switch(cell1.getCellType())  
	        			 {
	        			 case Cell.CELL_TYPE_NUMERIC:
	        			 
	        			   
	        				 
	        			 double val1 =  cell1.getNumericCellValue();
	        			 System.out.println(val1);
	        			 
	        			 break;
	        			 
	        			 case Cell.CELL_TYPE_STRING:
	        				String val2 = cell1.getStringCellValue();
	        				System.out.println(val2);
	        			 break;
                          
	        			 default:
                        	 boolean val3 = cell1.getBooleanCellValue();
                        	  System.out.println(val3);

	        			 }
	           } System.out.print(" - ");
	            
	           System.out.print("  ");
	        }
	        wb.close();
	        XlsxFileToRead.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        
        
        		
        		
        		
        		
		
		
				//Workbook wb = Workbook.getWorkbook(new File("samplefile.xls"));
		
	}

}
