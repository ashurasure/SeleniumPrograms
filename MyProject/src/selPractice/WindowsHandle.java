package selPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String s=driver.getWindowHandle();
	System.out.println(s);
}
}
