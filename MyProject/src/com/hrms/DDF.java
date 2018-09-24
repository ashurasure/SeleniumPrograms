package com.hrms;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDF {
@Test(invocationCount=3)
public void startup() {
	Reporter.log("startup method executed");
	//System.out.println("startup method executed");
}
@DataProvider
public Object[][] getdata(){
	Object[][] data=new Object[2][2];
	data[0][0]="admin";
	data[0][1]="123";
	data[1][0]="admin";
	data[1][1]="123";
	return data;
}
@Test(dataProvider="getdata")
	public void start(String un,String pw) {
	System.out.println(un+pw);
	Reporter.log(un+pw);

}
}
