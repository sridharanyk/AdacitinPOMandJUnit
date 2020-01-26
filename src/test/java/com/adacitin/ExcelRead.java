package com.adacitin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static String getData(int rowNo, int cellNo) throws Throwable {
		
		String v=null;
		
		File f = new File("D:\\Sridharan9AMProjectBatch\\Adacitin\\DataType\\Adacitin Input1.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(rowNo);
		
		Cell c = r.getCell(cellNo);
		
		int type = c.getCellType();
		
		if (type==1) {
			
			 v = c.getStringCellValue();
			
		} else if (DateUtil.isCellDateFormatted(c)) {
			
			Date d = c.getDateCellValue();
			
			SimpleDateFormat si = new SimpleDateFormat("dd-MMM-yy");
			
			v = si.format(d);
					
		} else {
			
			double d = c.getNumericCellValue();
			long l =(long)d;
			v = String.valueOf(l);
		} 

		return v;
	}
}
