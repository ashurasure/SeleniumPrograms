package excelutility;

import org.testng.annotations.Test;

public class ReadExcel {
//public static void main(String[] args)
	@Test
	public void startup(){
	Excelutil e=new Excelutil("E://EmpData.xlsx", "Sheet1");
	
	String strdata=e.stringdata(1, 1);
	System.out.println(strdata);
	double numdata1=e.numdata(1, 0);
	System.out.println(numdata1);
	e.rowcount();
	e.colcount();
}
}
