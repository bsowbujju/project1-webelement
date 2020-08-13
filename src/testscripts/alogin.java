package testscripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class alogin {
	public void openappln()
	{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://google.com");
	}


}
