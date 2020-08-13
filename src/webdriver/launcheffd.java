package webdriver;


public class launcheffd {
	public static void main(String args[])
	{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	webdriver Driver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	
	}
	

}
