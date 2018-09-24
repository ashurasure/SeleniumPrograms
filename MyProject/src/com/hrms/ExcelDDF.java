package com.hrms;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDDF {
public static void main(String[] args) throws Exception {
       FileInputStream f=new FileInputStream("E:\\EmpData.xlsx");
       XSSFWorkbook w=new XSSFWorkbook(f);
       XSSFSheet s=w.getSheet("Sheet1");
       System.out.println(s.getSheetName());
       int rowCount=s.getLastRowNum();
       System.out.println(rowCount);
       System.out.println(s.getPhysicalNumberOfRows());
       System.out.println(s.getRow(1).getCell(1).getStringCellValue());
       System.out.println(s.getRow(1).getCell(0).getNumericCellValue());
       
       int rows=s.getLastRowNum();
       System.out.println(rows);
       for(int i=0;i<rows;i++) {
    	  // System.out.println(s.getRow(i).getCell(i).getStringCellValue());
           //System.out.println(s.getRow(i).getCell(i).getNumericCellValue());  
       }
       f.close();
}
}
