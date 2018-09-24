package com.hrms;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class ExcelEx {
public static void main(String args[]) throws Exception {
	FileInputStream f=new FileInputStream("E:\\Suresh Sir Selinum\\05.SeleniumPrograms\\12345.xls");
	Workbook w=Workbook.getWorkbook(f);
	Sheet s=w.getSheet(0);
	//reading data from a cell
	System.out.println("data from a row is");
	int i=2;
	String empId=s.getCell(0, i).getContents();
	String empName=s.getCell(1, i).getContents();
	String empSal=s.getCell(2, i).getContents();
	System.out.println(empId);
	System.out.println(empSal);
	System.out.println(empName);

   //reading data from all rows
	System.out.println("data from all rows is");
	int rows=s.getRows();
	System.out.println(rows);
	for(int j=1;j<rows;j++) {
		String empId1=s.getCell(0, j).getContents();
		String empName1=s.getCell(1, j).getContents();
		String empSal1=s.getCell(2, j).getContents();
		System.out.println(empId1);
		System.out.println(empSal1);
		System.out.println(empName1);
	}
}
}
