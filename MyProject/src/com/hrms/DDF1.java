package com.hrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDF1 {
	WebDriver driver;
@Test(dataProvider="getdata")
public void login(String un,String pw) {
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys(un);
	driver.findElement(By.name("txtPassword")).sendKeys(pw);
	driver.findElement(By.name("Submit")).click();
	System.out.println("logged");
    Reporter.log("logged");
	driver.quit();
}
@DataProvider
public Object[][] getdata() {
Object[][]data=new Object[2][2];
data[0][0]="admin1";
data[0][1]="admin1";
data[1][0]="admin";
data[1][1]="admin";
return data;
}
}

