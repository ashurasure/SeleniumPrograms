package guruProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://live.guru99.com/index.php/");
		driver.getTitle().equalsIgnoreCase("Home page");
		System.out.println(driver.getTitle());
		WebElement e=driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[1]/div/p"));
		String s=e.getText();
		if(s=="DEFAULT WELCOME MSG!") {
			System.out.println("Text matched");
		}
		else {
			System.out.println("text not matched");
		}
		driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")).click();
		System.out.println(driver.getTitle().equalsIgnoreCase("Mobile"));
		//
		driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")).sendKeys("Name");;
		//driver.findElement(By.name("Sort By")).sendKeys("Name");
		driver.quit();
	}

}
