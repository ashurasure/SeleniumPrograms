package excelutility;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HRMSDDF{
	WebDriver driver;
	/*@BeforeMethod()
	public void startup() {
		
	}*/
	
	@Test(dataProvider="getdata")
	public void login(String un,String pw) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		driver.findElement(By.name("txtPassword")).sendKeys(pw);
		
		//Thread.sleep(3000);
		WebDriverWait w=new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
		driver.findElement(By.name("Submit")).click();
		System.out.println("logged in");
	    Reporter.log("logged");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    Assert.assertTrue(driver.getTitle().matches("OrangeHRM"),"invalid credentials");
	    int c=driver.findElements(By.tagName("iframe")).size();
		System.out.println(c);
}
	@DataProvider(name="getdata")
	public Object[][] getdata(){
		Excelutil e=new Excelutil("E://TestData1.xlsx", "Sheet2");
		int row=e.rowcount();
		int col=e.colcount();
		
		Object [][] data=new Object[row][2];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				//String celldata=e.stringdata(i, 0);
				data[i][j]=e.stringdata(i, j);
				//data[i][1]=e.stringdata(i, 1);
			}
			//System.out.println();
		}
		return data;
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
