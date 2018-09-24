package excelutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelBrowser {
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeTest
		public void browser(String browserName) {
		System.out.println("browser name is: "+browserName);
		//System.out.println(Thread.currentThread().getId());
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		    driver = new FirefoxDriver();
		    
		}
		
		/*System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver=new ChromeDriver();*/
	}
@Test
	public void login() {
	driver.navigate().to("https://google.com");
	//driver
}
@AfterTest
public void teardownn() {
	driver.close();
}
}
