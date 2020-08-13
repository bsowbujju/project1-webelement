package locators;

import webdriver.FirefoxDriver;
import webdriver.WebDriver;

public class passthedata {

	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	String title=driver.getTitle();
	System.out.println(title);
	String Url=driver.getCurrentUrl();
	System.out.println(Url);
	webelements ele=driver.findelements(by.tagname("input").sendkey("abc").click();
}



