package webelement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cpytextdata 
{

	public static void main(String args[]) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Kavya/Documents/login.html");
	WebElement ele= (WebElement) driver.findElements(By.id("t1"));

	ele.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(3000);
	WebElement ele1= (WebElement) driver.findElements(By.id("t2"));

	ele1.sendKeys(Keys.CONTROL+"c");
	Thread.sleep(3000);
	ele1.clear();
	ele1.sendKeys(Keys.CONTROL+"v");
	WebElement ele= (WebElement) driver.findElements(By.id("t1"));
	WebElement ele1= (WebElement) driver.findElements(By.id("t2"));
	ele.sendKeys(Keys.CONTROL+"ac");
	ele.sendKeys(Keys.CONTROL+"v");


	}
}



