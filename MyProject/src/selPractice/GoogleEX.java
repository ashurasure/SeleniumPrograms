package selPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleEX {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.navigate().to("https://google.com");
	d.findElement(By.name("q")).sendKeys("abcd",Keys.ENTER);
	
}
}
