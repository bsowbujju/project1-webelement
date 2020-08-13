package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class defaultvalue 
{

	public static void main(String args[]) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Kavya/Documents/login.html");
	WebElement ele= (WebElement) driver.findElements(By.xpath("//input[@value='text']"));

	Thread.sleep(3000);
	ele.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(3000);
	ele.sendKeys(Keys.DELETE);
	}
}

	

	



