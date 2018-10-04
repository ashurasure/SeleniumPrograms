package TestngEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {
	WebDriver driver; 
	@Parameters({"browser"})
	@BeforeTest
	public void url(String browser) {
		System.out.println(browser);
		System.out.println(Thread.currentThread().getId());
		if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		    driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
	}
@Test
public void google() {
	driver.navigate().to("https://google.com");
}
}
