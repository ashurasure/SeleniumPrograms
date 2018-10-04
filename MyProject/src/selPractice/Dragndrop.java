package selPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.navigate().to("http://only-testing-blog.blogspot.in/2014/09/drag-and-drop.html");
	Actions a=new Actions(d);
	WebElement src=d.findElement(By.xpath("//*[@id=\"dragdiv\"]"));
	WebElement dst=d.findElement(By.xpath("//*[@id=\"dropdiv\"]"));
	a.dragAndDrop(src, dst).build().perform();
	
}
}
