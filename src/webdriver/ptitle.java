package webdriver;

public class ptitle {
	public static void main(String args[])
	{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	String title=driver.getTitle();
	System.out.println(title);
	String Url=driver.getCurrentUrl();
	System.out.println(Url);

	}
	

}




