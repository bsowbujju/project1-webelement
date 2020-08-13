package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cleartxbx {

	public static void main(String args[])
	{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Kavya/Documents/login.html");
	

	
	WebElement ele=(WebElement) driver.findElements(By.xpath("//input[@value='abc']"));
	boolean b=ele.clear();
	
	System.out.println(b);
	if(b)
	{
		System.out.println("tbox is clear");
	}else
	
	{
			System.out.println("tbox is not clear");

		}
	}

}


	




}
