package excelutility;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil {
	FileInputStream f;
	XSSFWorkbook w;
	XSSFSheet s;
	public Excelutil(String excelpath,String sheetname) {
		try {
			f=new FileInputStream(excelpath);
			w=new XSSFWorkbook(f);
			s=w.getSheet(sheetname);
			System.out.println(s.getSheetName());
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public String stringdata(int row,int col) {
	String data=s.getRow(row).getCell(col).getStringCellValue();
	//System.out.println(data);	
		return data;
	}
	public double numdata(int row,int col){
		double data1=s.getRow(row).getCell(col).getNumericCellValue();
		//System.out.println(data1);
		return data1;
	}
public int rowcount() {
	//System.out.println(s.getLastRowNum());
	int r=s.getPhysicalNumberOfRows();
   // int r=s.getLastRowNum();
    //r=r+1;
	return r;
}
public int colcount() {
	int c=s.getRow(0).getPhysicalNumberOfCells();
	return c;
}
}
