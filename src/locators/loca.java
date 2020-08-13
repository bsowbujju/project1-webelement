package locators;


public class loca {

	public static void main(String args[])
	{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	webdriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	WebElements ele=driver.findElement(By.id(""));
	Thread.sleep(3000);
	ele.click();
	}
	

}


