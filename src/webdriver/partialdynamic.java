package webdriver;

public class partialdynamic {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	driver.get("https://www.gmail.com");

	driver.findelements(by.id("username").sendkey("sowmyacs405");
	driver.findelements(By.name("password").sendkey("vivaan2710");
	driver.findelements(By.xpath("//div[.='login']").click();
		
	String title=driver.getTitle();
	System.out.println(title);
	
	if(title.contains("login"))
	{
		
		System.out.println("home page is displaayed,pass");
	}

		System.out.println("home page is not displaayed,fail");
}

     String Url=driver.getUrl();
     System.out.println(Url);
     
  if(title.equals("https://www.google.com/home page link"))
 	{
 		
 		System.out.println("home page is displaayed,pass");
 	}

 		System.out.println("home page is not displaayed,fail");
 		
 		}
 		


}
